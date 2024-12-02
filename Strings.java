package Java_Practice;

public class Strings {
    public static void main(String[] args) {

        String name = "Aayush";  // in this way it creates only one object inside "String loop" in heap memory
        String name2 = "Aayush"; //
        System.out.println(name);

        // name2 = "Varvatkar";      // it creates the another object in string pool
        // System.out.println(name2);

        // as strings are immutable, you cannot change or moidfy the object

        System.out.println(name == name2); // it compares the objects inside the string pool


        // NEw KEYWORD
 
        String name3 = new String("AAYUSH");  // it creates the separate objects in heap memory and ouside the string pol
        String name4 = new String("AAYUSH");

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4)); // it compares the objects inside the heap memory and outside the string pool

        System.out.println(name3.charAt(2)); // Indicates at which letter is at which position

    }
}
