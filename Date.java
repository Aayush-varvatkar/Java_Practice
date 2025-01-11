package Java_Practice;
// import java.util.scanner;

class DateDemo{
    private int day,month,year;
    public int getday(){
        return day;
    }
    public void setday(int d){
        day = d;
    }
    public void setmonth(int m){
        month = m;
    }
    public void setyear(int y){
        year = y;
    }
}

public class Date {
    public static void main (String args[]){
        DateDemo a = new DateDemo();
        a.setday(12);
        // DateDemo b = new DateDemo();
        a.setmonth(5);
        a.setyear(2004);
        System.out.println("Date is"+a.getday());    
    }
}
