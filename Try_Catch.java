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
            System.out.println("Output is" + k);    // if there is an exception, the remaining code will not be executed
       }
       catch(Exception e){
        System.out.println("Error occured");
       }
       finally{        // finally block will always execute even if there is an exception or not
        sc.close();
       }
    }
}
