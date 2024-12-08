package Java_Practice;

//Method overloading : methods with same name but different signatures

class Addition{

    int add(int a, int b){
        return a + b;
    }
    float add(float a, float b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Addition is:" + a.add(6,9));
        System.out.println("Addition is:" + a.add(0.5f, 9.5f));
        System.out.println("Addition is:" + a.add(8,15,27));
    }
}
