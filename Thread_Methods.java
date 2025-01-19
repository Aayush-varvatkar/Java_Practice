package Java_Practice;


class NewThr1 extends Thread {
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("I am a thread1");
            try {
                Thread.sleep(100);     // This will make the thread sleep for 100 milliseconds
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class NewThr2 extends Thread {
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("Thread2");
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        NewThr1 t1 = new NewThr1();
        NewThr2 t2 = new NewThr2();

        t1.start();

        // try {
        //     t1.join();  // This will make sure that t1 will complete its execution before t2 starts
        // }
        // catch (Exception e){
        //     e.printStackTrace();
        // }

        t2.start();
    }
}
