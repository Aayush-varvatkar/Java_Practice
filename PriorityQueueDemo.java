package Java_Practice;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();      // Smaller element has a higher priority     default is min heap

        pq.offer(33);                                         // Smaller elements will be at the top of the queue,                                       
        pq.offer(55);
        pq.offer(11);
        pq.offer(22);

        System.out.println(pq);

        pq.poll();                                   // Removes the top priority element
        System.out.println(pq);


        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());      // Higher element has a higher priority      max heap

        pq2.offer(36);                                                                   // Higher elements will be at the top of the queue,
        pq2.offer(52);
        pq2.offer(16);
        pq2.offer(21);

        System.out.println(pq2);

        pq2.poll();                                   // Removes the top priority element
        System.out.println(pq2);
    }
}
