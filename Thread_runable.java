package Java_Practice;

// This program demonstrates how to create a thread by implementing the Runnable interface.

class MyThreadrunable1 implements Runnable{
    @Override  
    public void run(){
        int i = 0;
        while(i<=100){
            System.out.println("MyThreadrunable1 is running");
            i++;
        }
      }
}

class MyThreadrunable2 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while(i<=100){
            System.out.println("MyThreadrunable2");
            i++;
        }
    }
}


public class Thread_runable {
    public static void main(String[] args) {
        MyThreadrunable1 bullet1 = new MyThreadrunable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadrunable2 bullet2 = new MyThreadrunable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
