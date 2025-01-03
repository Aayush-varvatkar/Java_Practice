package Java_Practice;

import java.util.*;

public class Throw_Exception {
    public static void main(String[] args) {
        int i, j, k;
        i = 8;
        Scanner sc = new Scanner(System.in);
        j = sc.nextInt();

        try {
            k = i + j;
            if (k <= 10) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("The value of k should be greater than 10");
        } finally {
            sc.close();
        }

    }
}
