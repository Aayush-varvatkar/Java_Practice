package Java_Practice;
import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(33);
        adq.offer(55);
        adq.offer(11);
        adq.offerFirst(100);   // Adds element at the beginning
        adq.offerLast(200);    // Adds element at the end

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
