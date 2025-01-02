package Java_Practice;

class Animal2{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal2{
    void sound(){
        System.out.println("Cat meows");
    }
}
class lion extends Animal2{
    void sound(){
        System.out.println("Lion roars");
    }
}
class cheetah extends Animal2{
    void sound(){
        System.out.println("Cheetah growls");
    }
}

public class Polymorphi {
    public static void main(String[] args) {
        Animal2 a1 = new Animal2(); //create's object of Animal class
        Animal2 a2 = new Cat(); //create's object of Cat class
        Animal2 a3 = new lion(); //create's object of lion class
        Animal2 a4 = new cheetah(); //create's object of cheetah class

        a1.sound();
        a2.sound();
        a3.sound();
        a4.sound();
    }
}
