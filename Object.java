package Java_Practice;

public class Object {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.position = "HR";
        p1.name = "Krushika umredkar";
        p1.Age = 24;

        Employee p2 = new Employee();
        p2.position = "Team leader";
        p2.name = "pratham";
        p2.Age = 20;

        Employee p3 = new Employee();
        p3.position = "Team co-ordinator";
        p3.name = "Maaz";
        p3.Age = 20;

        System.out.println(p1.position + " " + p1.name + " " + p1.Age);
        System.out.println(p2.position + " " + p2.name + " " + p2.Age);
        System.out.println(p3.position + " " + p3.name + " " + p3.Age);

    }
    
}

class Employee {
    String position;
    String name;
    int Age;
}
