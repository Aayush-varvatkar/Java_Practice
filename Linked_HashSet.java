package Java_Practice;
import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> Val = new LinkedHashSet<>();

        Val.add(88);
        Val.add(99);
        Val.add(77);
        Val.add(66);
        Val.add(55);

        System.out.println(Val);

        Val.remove(88);
        System.out.println(Val);

        System.out.println(Val.contains(77));

        System.out.println(Val.isEmpty());

        System.out.println(Val.size());

        Val.clear();
        System.out.println(Val);

    }
}
