package Java_Practice;

// This program demonstrates how to create a thread by extending the Thread class.

class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 500) {
            System.out.println("MyThread1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 500) {
            System.out.println("MyThread2");
            i++;
        }
    }
}

public class Thread_extends {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();                       // start() is a method of Thread class used to start a thread.

        MyThread2 t2 = new MyThread2();
        t2.start();                      // here, t1 and t2 are two threads running concurrently.
    }
}
