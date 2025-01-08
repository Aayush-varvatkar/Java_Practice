package Java_Practice;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Calendar_Demo {

    public static void main(String[] args) {
        
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());


        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        // System.out.println(c1.getTimeZone());
        System.out.println(c1.getTimeZone().getID());

        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.HOUR));
        System.out.println(c1.get(Calendar.MINUTE));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println(c1.get(Calendar.DAY_OF_WEEK));

        System.out.println(c1.get(Calendar.HOUR) + ":" + c1.get(Calendar.MINUTE) + ":" + c1.get(Calendar.SECOND));




        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2013));

        System.out.println(TimeZone.getAvailableIDs()[1]); 
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
    }
    
}
