package Java_Practice;


class Animal3 {
    void eat(){
        System.out.println("Animal eat's food");
    }
}

class Horse extends Animal3{
    void eat(){
        System.out.println("Horse eats grass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal3 A1 = new Animal3();
        Animal3 A2 = new Horse();

        A1.eat();
        A2.eat();
    }
}
