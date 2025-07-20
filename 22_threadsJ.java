class A {
    public void display() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Inside class A, iteration: " + i);
        }
    }
}

class B {
    public void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside class B, iteration: " + i);
        }
    }
}

// if we extend the Thread class, we need to override the run() method
// and implement the logic we want to execute in the thread.
class AThread extends Thread {
    public void run() {

        for (int i = 0; i < 25; i++) {
            System.out.println("Inside class A, iteration: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // Sleep for 100 milliseconds to simulate work
              // This is to demonstrate that the thread is running concurrently
        }
    }
}

class BThread extends Thread {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Inside class B, iteration: " + i);
        }
    }
}

// Thread class implements the Runnable interface, so we can also implement
// Runnable interface and override the run() method to define the task for the
// thread.
// Runnable interface is a functional interface, so we can use lambda
// expressions
// to create instances of it.

class ARun implements Runnable {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Inside class A, iteration: " + i);
        }
    }
}

class BRun implements Runnable {
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("Inside class B, iteration: " + i);
        }
    }
}

public class threadsJ {

    // In Java, threads are used to perform multiple tasks simultaneously.
    // A thread is a lightweight process that can run concurrently with other
    // threads.
    // Java provides built-in support for multithreading through the Thread class
    // and the Runnable interface.
    // To create a thread, you can either extend the Thread class or implement the
    // Runnable interface.
    // The Thread class provides methods to start, pause, resume, and stop a thread.
    // The Runnable interface is a functional interface that represents a task that
    // can be executed by a thread.
    // To start a thread, you create an instance of the Thread class or a class that
    // implements Runnable,
    // and then call the start() method on that instance.
    public static void main(String[] args) {

        // A a = new A();
        // B b = new B();

        // Thread thread1 = new Thread(() -> a.display());// Using a lambda expression
        // // to call the display method of class
        // // Ax
        // Thread thread2 = new Thread(() -> b.display());

        // thread1.start();
        // thread2.start();

        /*
         * AThread aThread = new AThread();
         * BThread bThread = new BThread();
         * 
         * aThread.setPriority(Thread.MAX_PRIORITY); // Setting the priority of thread A
         * to maximum
         * aThread.start();
         * bThread.start();
         */

        // thread priority
        // Thread priority is a way to indicate the relative importance of a thread.
        // In Java, thread priority is represented by an integer value between 1 and 10,
        // where 1 is the lowest priority and 10 is the highest priority.

        // Runnable is a functional interface that represents a task that can be
        // executed by a thread.
        // It has a single abstract method called run() that contains the code to be
        // executed by the thread.

        ARun aRun = new ARun();
        BRun bRun = new BRun();

        Thread thread1 = new Thread(aRun);
        Thread thread2 = new Thread(bRun);

        thread1.start();
        thread2.start();
    }
}

// Thread states
// A thread can be in one of the following states:
// 1. New: A thread that is in the new state is created but not yet started.
// 2. Runnable: A thread that is in the runnable state is ready to run and
// waiting for CPU time.
// 3. Blocked: A thread that is in the blocked state is waiting for a monitor
// lock to enter a synchronized block/method.
// 4. Waiting: A thread that is in the waiting state is waiting for another
// thread to perform a particular action.
// 5. Timed Waiting: A thread that is in the timed waiting state is waiting for
// another thread to perform an action for a specified waiting time.
// 6. Terminated: A thread that has completed its execution is in the terminated
// state.
