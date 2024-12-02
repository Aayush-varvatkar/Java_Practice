package Java_Practice;
import java.util.Scanner;

public class Ifelse {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your age");
        // int age = sc.nextInt();

        // if(age>=18){
        //     System.out.println("You can drive");
        // }
        // else{
        //     System.out.println("You can not drive");
        // }


    
        // System.out.println("Enter your number");
        // int num = sc.nextInt();

        // if(num%2==0){
        //     System.out.println("Number is even");
        // }
        // else{
        //     System.out.println("Number is odd");
        // }



        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        if(n1==n2){
            System.out.println("n1 and n2 are equal");
        }
        else if(n1>n2){
            System.out.println("n1 is greater than n2");
        }
        else{
            System.out.println("n1 is smaller than n2");
        }


        sc.close();
    }
}
