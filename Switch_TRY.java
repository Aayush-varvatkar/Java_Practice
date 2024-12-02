package Java_Practice;
import java.util.Scanner;

public class Switch_TRY{
    public static void main(String args[]){
        int button;
        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Red");
            break;
            case 2: System.out.println("blue");
            break;
            case 3: System.out.println("Purple");
            break;
            default: System.out.println("Invalid nummber");
        }

        sc.close();
    }
}
