package Java_Practice;


class Animal {
    void eat(){
        System.out.println("Animal eat's food");
    }
}

class Horse extends Animal{
    void eat(){
        System.out.println("Horse eats grass");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        Animal A2 = new Horse();

        A1.eat();
        A2.eat();
    }
}
