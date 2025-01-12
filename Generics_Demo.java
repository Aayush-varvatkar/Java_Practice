package Java_Practice;

// feature that allows you to write code that can handle any type of object in a type-safe manner.
// Generics_Demo and Generic_Print are connected files.

public class Generics_Demo <T>{
    T thingToPrint;

    public Generics_Demo(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
