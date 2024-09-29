class ThreadEsempio extends Thread {
    private String messaggio; // Message to be printed by the thread

    /*
     * Threading is a concept that allows multiple operations to run simultaneously in your program.
     * It is useful for improving efficiency, especially in applications that require I/O operations,
     * such as loading data or handling requests from multiple users.
     *
     * Key Concepts:
     *     Thread: A unit of execution. Each thread can perform a task independently of others.
     *     Synchronization: When multiple threads access shared resources, it is important to manage
     *     access properly to avoid conflicts.
     *     Runnable Interface: To create a thread, you can implement the Runnable interface and
     *     override the run() method.
     */

    public ThreadEsempio(String messaggio) {
        this.messaggio = messaggio; // Initialize the message
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(messaggio); // Print the message
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("The thread has been interrupted.");
            }
        }
    }
}

public class EsempioMultithreading {
    public static void main(String[] args) {
        // Create two threads with different messages
        ThreadEsempio thread1 = new ThreadEsempio("Hello from Thread 1!");
        ThreadEsempio thread2 = new ThreadEsempio("Hello from Thread 2!");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

/**
 * EsempioMultithreading Class
 *
 * This class demonstrates the use of multithreading in Java.
 *
 * Main Features:
 *
 *     - Creation of threads that execute concurrently.
 *     - Each thread prints a message multiple times with a delay.
 */

/**
 * Key Features of This Code:
 *
 *     Thread Creation: The ThreadEsempio class extends the Thread class and overrides the run() method to define the thread's behavior.
 *     Concurrent Execution: Two threads are created in the main method and started, allowing them to print messages concurrently.
 *     Exception Handling: The code properly handles InterruptedException that might occur when a thread is put to sleep.
 */
