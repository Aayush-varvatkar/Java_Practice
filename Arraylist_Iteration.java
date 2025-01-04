package Java_Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Iteration {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); 
        List.add(10);
        List.add(20);
        List.add(30);

        System.out.println(List);


        // Using Iterator - to iterate through the list
       Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println("Value is " + it.next());
        }

        // Using for loop
        for(int i=0; i<List.size(); i++){
            System.out.println("Value is " + List.get(i));
        }

        // Using for each loop
        for(int i : List){
            System.out.println("Value is " + i);
        }
}
}
