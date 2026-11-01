
class ChatUser extends Thread {
    private volatile boolean running = true;
    private boolean paused = false;
    private final Object lock = new Object();

    ChatUser(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    // Suspend thread safely
    void pauseThread() {
        synchronized (lock) {
            paused = true;
            System.out.println(getName() + " is paused.");
        }
    }

    // Resume thread safely
    void resumeThread() {
        synchronized (lock) {
            paused = false;
            lock.notifyAll();
            System.out.println(getName() + " is resumed.");
        }
    }

    // Terminate thread safely
    void terminateThread() {
        running = false;
        resumeThread();
        System.out.println(getName() + " is terminating.");
    }

    // Check whether thread is paused
    void checkPause() throws InterruptedException {
        synchronized (lock) {
            while (paused && running) {
                lock.wait();
            }
        }
    }

    public void run() {
        try {
            for (int i = 1; i <= 5 && running; i++) {
                checkPause();

                if (!running)
                    break;

                System.out.println(getName() +
                    " sends message: Hello " + i);

                System.out.println(getName() +
                    " receives a message.");

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " has left the chat.");
    }
}

public class Main {
    public static void main(String[] args) {
        ChatUser user1 = new ChatUser(
            "User 1 (Important)", Thread.MAX_PRIORITY);

        ChatUser user2 = new ChatUser(
            "User 2", Thread.NORM_PRIORITY);

        ChatUser user3 = new ChatUser(
            "User 3", Thread.MIN_PRIORITY);

        // Start chat threads
        user1.start();
        user2.start();
        user3.start();

        try {
            Thread.sleep(800);

            // Suspend User 2
            user2.pauseThread();

            Thread.sleep(1000);

            // Resume User 2
            user2.resumeThread();

            Thread.sleep(800);

            // Terminate User 3
            user3.terminateThread();

            // Check thread activity
            System.out.println("\n--- Thread Status ---");
            System.out.println("User 1 Alive: " +
                user1.isAlive());
            System.out.println("User 2 Alive: " +
                user2.isAlive());
            System.out.println("User 3 Alive: " +
                user3.isAlive());

            // Wait for all threads to finish
            user1.join();
            user2.join();
            user3.join();

            System.out.println("\nAll chat threads completed.");

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
