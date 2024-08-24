package Java_Practice;
import java.util.Scanner;

public class Input_scanner {
public static void main(String[] args) {
    System.out.println("Enter your value below");

    Scanner val = new Scanner(System.in);

    int value = val.nextInt();
    System.out.println(value);

    val.close();
}
}