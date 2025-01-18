package Java_Practice;

class MYThread extends Thread {
    public  MYThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running");
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MYThread t1 = new MYThread("Aayush");
        MYThread t2 = new MYThread("HaHaHaHa.....");
        t1.start();
        t2.start();

        System.out.println("I'D of this Thread is:" + t1.getId());
        System.out.println("Name of this Thread is:" + t1.getName());
        System.out.println("I'D of this Thread is:" + t2.getId());
        System.out.println("Name of this Thread is:" + t2.getName());
    }
}
