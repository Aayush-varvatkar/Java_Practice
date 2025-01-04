package Java_Practice;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();     // Creating an array list with icremental size
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println(List);

        List.add(2, 25);       // Adding element at specific index
        System.out.println(List);


        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(100);
        List2.add(200);
        List2.add(300);

        List.addAll(List2);     // Adding all elements of List2 to List
        System.out.println(List);

        System.out.println(List.get(3));   // Getting element at specific index


        List.remove(2);     // Removing element at specific index
        System.out.println(List);
        List.remove(Integer.valueOf(100));  // Removing element by value
        System.out.println(List);


        List.set(2, 335);   // Replacing (or updating) element at specific index
        System.out.println(List);   

        // List.contains(40);
        System.out.println(List.contains(40));   // Checking if element is present in the list


        List.clear();   // Clearing the list
    } 
}
