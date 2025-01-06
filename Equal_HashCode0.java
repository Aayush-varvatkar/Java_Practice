package Java_Practice;
import java.util.HashSet;

public class Equal_HashCode0 {
    public static void main(String[] args) {
        HashSet<Equal_HashCode1> StudentSet = new HashSet<>();

        StudentSet.add(new Equal_HashCode1("John", 101));
        StudentSet.add(new Equal_HashCode1("Mikel", 102));
        StudentSet.add(new Equal_HashCode1("Jack", 103));
        StudentSet.add(new Equal_HashCode1("Mikel", 102));

        System.out.println(StudentSet);
    }
}
