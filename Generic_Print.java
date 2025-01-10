package Java_Practice;

public class Generic_Print {
    public static void main(String[] args) {
       Generics_Demo<Integer> ans = new Generics_Demo<Integer>(22);
         ans.print();

         Generics_Demo<String> ans2 = new Generics_Demo<String>("Hello, It's Aayush");
            ans2.print();
    }   
}
