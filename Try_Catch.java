package Java_Practice;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        int i, j, k;
        i = 8;
        Scanner sc = new Scanner(System.in);
       j = sc.nextInt();

       try{
            k = i/j;
            System.out.println("Output is" + k);
       }
       catch(Exception e){
        System.out.println("Error occured");
       }
    }
}
