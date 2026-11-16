
class User extends Thread
{
    String name;
    boolean running = true;
    boolean paused = false;

    User(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for (int i = 1; i <= 3 && running; i++)
        {
            synchronized(this)
            {
                while (paused)
                {
                    try {
                        wait();
                    }
                    catch(Exception e) {}
                }
            }

            if (!running)
                break;

            System.out.println(name + " sends message " + i);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {}
        }

        System.out.println(name + " left the chat.");
    }

    void suspendThread()
    {
        paused = true;
    }

    synchronized void resumeThread()
    {
        paused = false;
        notify();
    }

    void stopThread()
    {
        running = false;
        resumeThread();
    }
}

public class Practical_8
{
    public static void main(String[] args)
    {
        User u1 = new User("Rahul");
        User u2 = new User("Amit");

        // Set thread priorities
        u1.setPriority(Thread.MAX_PRIORITY);
        u2.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        u1.start();
        u2.start();

        // Check thread activity
        System.out.println("Rahul Alive: " + u1.isAlive());
        System.out.println("Amit Alive: " + u2.isAlive());

        // Suspend Rahul
        u1.suspendThread();

        // Resume Rahul
        u1.resumeThread();

        // Wait for threads to finish
        try
        {
            u1.join();
            u2.join();
        }
        catch(Exception e) {}

        // Terminate Rahul
        u1.stopThread();

        System.out.println("Chat Ended");
    }
}
