package Java_Practice;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("lion");      // first element added will be at the bottom
        animal.push("Tiger");
        animal.push("Dog");
        animal.push("Cat");       // last element added will be at the top

        System.out.println("Stack: " + animal);

        animal.pop();            // remove the top element, works on LIFO
        System.out.println("after pop " + animal);

        System.out.println(animal.peek());    // return the top element  
    }
}
