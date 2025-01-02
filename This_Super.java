package Java_Practice;

class Parent{
    void relation(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    void relation(){
        System.out.println("Child class");
    }

    void display(){
        this.relation(); // calls the subclass method
        super.relation(); // calls the superclass method
    }
}


public class This_Super {
    public static void main(String[] args) {
        Child A4 = new Child();
        A4.display();
    }
}
