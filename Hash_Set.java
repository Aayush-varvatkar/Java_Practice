package Java_Practice;
import java.util.HashSet;   

public class Hash_Set {
    public static void main(String[] args) {
        
        HashSet<Integer> Values = new HashSet<>();

        Values.add(88);
        Values.add(99);
        Values.add(77);
        Values.add(66);
        Values.add(55); 

        System.out.println(Values);

        Values.remove(88);
        System.out.println(Values);

        System.out.println(Values.contains(77));

        System.out.println(Values.isEmpty());

        System.out.println(Values.size());

        Values.clear();
        System.out.println(Values);
    }
}
