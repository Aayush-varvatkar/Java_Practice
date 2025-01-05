package Java_Practice;
import java.util.LinkedList;
import java.util.Queue;
public class Queuedemo {
    public static void main(String[] args) {

        Queue<Integer> num = new LinkedList<>();

        num.offer(10);      // Offer is used to add element in the queue
        num.offer(20);      // works on FIFO
        num.offer(30);
        System.out.println(num);

        num.poll();         // Poll is used to remove element from the queue
        System.out.println(num);

        System.out.println(num.peek());     // Peek is used to get the top element
    }
}
