package Java_Practice;

public class Animal {
    void eat(){
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dogs can bark");
    }
}

// Animal and interference files are interconnected

// Animal file contail the class and inheritance file contain the objects

// inheritance / pakages and access specifier concepts are used