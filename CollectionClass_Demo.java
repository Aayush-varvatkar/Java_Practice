package Java_Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass_Demo {
    public static void main(String[] args) {
        
        List<Integer> List = new ArrayList<>();
            
            List.add(1);
            List.add(2);
            List.add(3);
            List.add(4);
            List.add(5);
            List.add(5);

            System.out.println(Collections.max(List));      // returns the maximum value in the list
            System.out.println(Collections.min(List));      // returns the minimum value in the list

            System.out.println(Collections.frequency(List, 5));

            Collections.sort(List);     // sorts the list in ascending order
            System.out.println(List);

            Collections.sort(List, Comparator.reverseOrder());    // sorts the list in descending order
            System.out.println(List);
    }
}
