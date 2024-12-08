package Java_Practice;

class Studentinfo{
	String Name;
	int std;
	int RollNo;

	public Studentinfo(){
		System.out.println("This is non-parameterized constructor");
	}

	public Studentinfo(String Name1, int Std1, int RollNo1){
		Name = Name1;
		std = Std1;
		RollNo = RollNo1;
	}

	void display(){
		System.out.println(Name + " is in " + std + " has " + RollNo + "RollNo.");
	}

}

public class Constructor_use {
	public static void main(String[] args) {
		Studentinfo S1 = new Studentinfo();

		Studentinfo S2 = new Studentinfo("Shivam", 10, 33);
		S2.display();
	}
}
