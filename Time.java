package Java_Practice;

public class Time {
    public static void main(String[] args) {
        
        System.out.println(System.currentTimeMillis());  // returns the current time in milliseconds   - from 1 jan 1970
        System.out.println(System.currentTimeMillis() / 1000);  // returns the current time in seconds   - 
        System.out.println(System.currentTimeMillis() / 1000 / 3600);  // returns the current time in hours   - 
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24);  // returns the current time in days   - 
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);  // returns the current time in years   -from 1 jan 1970

    }
}
