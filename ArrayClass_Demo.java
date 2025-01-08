package Java_Practice;
import java.util.Arrays;

public class ArrayClass_Demo {
    public static void main(String[] args) {
        
        int num[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // System.out.println(Arrays.toString(num));     //needs to convert the array to string to print it

        // System.out.println(Arrays.binarySearch(num, 5));  // returns the index of the element if present.
        int index = Arrays.binarySearch(num, 5);
        System.out.println(index);

        int  num1[] = {6, 88, 55, 78, 2, 63, 22, 54};
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

        Arrays.fill(num1, 10);
        System.out.println(Arrays.toString(num1));
    }
}
