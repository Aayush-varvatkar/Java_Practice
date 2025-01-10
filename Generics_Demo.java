package Java_Practice;

public class Generics_Demo <T>{
    T thingToPrint;

    public Generics_Demo(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
