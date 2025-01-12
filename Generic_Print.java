package Java_Practice;

// feature that allows you to write code that can handle any type of object in a type-safe manner.
// Generics_Demo and Generic_Print are connected files.

public class Generic_Print {
    public static void main(String[] args) {
       Generics_Demo<Integer> ans = new Generics_Demo<Integer>(22);
         ans.print();

         Generics_Demo<String> ans2 = new Generics_Demo<String>("Hello, It's Aayush");
            ans2.print();
    }   
}
