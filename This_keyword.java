package Java_Practice;

class date{
    int date;
    int month;
    int year;
    
    date(){
        System.out.println("Connected");
    }

    date(int date1, int month, int year1){
        this(date1);             //calls parameterized constructor 
        this.date = date1;
        this.month = month;       // here "this" keyboard used to remove the shadow of instance field
       year = year1;
    }

    date(int d){
        this();                 // calls the non -parameterized constructor
        date = d;
        System.out.println("date:" + date);
    }

    void display(){
        System.out.println("Date:" + date + "/" + month + "/" + year);
    }

}

public class This_keyword {
    public static void main(String[] args) {
        date d1 = new date(15,07,2024);
        d1.display();

        date d2 = new date(31);
        d2.display();
    }
}
