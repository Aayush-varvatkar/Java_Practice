package Java_Practice;

// Thread Priority:   Thread Priority determines the relative importance of a thread in relation to other threads.
//          MIN_PRIORITY = 1 (Lowest priority)
//          NORM_PRIORITY = 5 (Default priority)
//          MAX_PRIORITY = 10 (Highest priority)  


class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<=200){
            System.out.println("Thank you " + this.getName());
            i++;
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Aayush");
        MyThr t2 = new MyThr("Kazuto");
        MyThr t3 = new MyThr("Tyson");
        MyThr t4 = new MyThr("Shambhu");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);  

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
