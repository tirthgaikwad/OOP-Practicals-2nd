# Experiment No. 8 — Multithreading Using Chat System in Java

## Problem Statement

Design and develop a Java application that uses multithreading to simulate a simple chat system, where each thread represents an individual user responsible for sending and receiving messages.

The program should use `isAlive()` to monitor thread activity and `join()` to synchronize thread execution. It should also demonstrate thread priorities for handling important messages and include mechanisms for suspending, resuming, and terminating threads.

## Aim

To develop a Java chat application using multithreading and demonstrate thread synchronization, priorities, and thread lifecycle management.

## Objectives

- Create separate threads to represent individual chat users.
- Simulate sending and receiving messages.
- Use `isAlive()` to check whether a thread is active.
- Use `join()` to synchronize thread execution.
- Demonstrate thread priorities for important messages.
- Implement safe mechanisms to suspend, resume, and terminate threads.

## Theory

**Multithreading** is a Java feature that allows multiple threads to execute concurrently within a program.

In a chat system, each user can be represented by a separate thread that sends and receives messages.

### Thread Methods

1. **isAlive():** Checks whether a thread is still running.
2. **join():** Waits for a thread to finish its execution.
3. **setPriority():** Sets the priority of a thread.
4. **wait():** Temporarily pauses a thread until it receives notification.
5. **notifyAll():** Resumes threads waiting on the same object's monitor.
6. **Thread Termination:** Stops a thread safely using a termination flag.

### Thread Priorities

Java provides thread priorities from 1 to 10:

- MIN_PRIORITY = 1
- NORM_PRIORITY = 5
- MAX_PRIORITY = 10

Higher priority indicates a preference for CPU scheduling, but does not guarantee execution order.

## Associated Tasks

1. Create separate threads for chat users.
2. Simulate sending and receiving messages.
3. Monitor thread activity using `isAlive()`.
4. Synchronize thread execution using `join()`.
5. Set priorities for important messages.
6. Implement safe suspension and resumption.
7. Terminate threads safely.

## Concepts Used

- Multithreading
- Thread Class
- Runnable Interface
- Thread Lifecycle
- Thread Priorities
- isAlive() and join()
- Synchronization
- wait() and notifyAll()

## Expected Output

The program should simulate multiple users communicating through separate threads. It should demonstrate message exchange, thread activity checking, synchronization, priorities, and thread suspension, resumption, and termination.

## Conclusion

Thus, multithreading is demonstrated successfully in Java using a simple chat system. Thread methods and synchronization mechanisms are used to manage multiple users and control their execution.

