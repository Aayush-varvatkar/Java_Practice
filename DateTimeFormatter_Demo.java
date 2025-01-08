package Java_Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Demo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);


        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String mydate = dt.format(dft);
        System.out.println(mydate);

        DateTimeFormatter dft2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mydate2 = dt.format(dft2);
        System.out.println(mydate2);


        DateTimeFormatter dft3 = DateTimeFormatter.ofPattern("H:m:s a");
        String mytime = dt.format(dft3);
        System.out.println(mytime);

}
}
