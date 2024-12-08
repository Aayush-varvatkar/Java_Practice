package Java_Practice;


// class HELL {
//     public void display() {
//         System.out.println("HEY THERE, I'M Aayush Varvatkar.");
//         System.out.println("I'm the king of AZKEBAN");
//     }
// }


public class Display_Method {
    public static void main(String[] args) {

        // HELL call = new HELL();
        // call.display();

        Subject S1 = new Subject();
        S1.Name = "JAVA Full Stack";
        S1.faculty = "Aayush";

        S1.Lecture();
    }
}



class Subject {

String Name;
String faculty;

public void Lecture(){
        System.out.println("We have " + faculty + " as a FACULTY for subject " + Name);
}
}



// README
// The ' display() ' method can be named as anything 

