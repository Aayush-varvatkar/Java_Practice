package Java_Practice;

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

public class Own_exception {
    public static void main(String[] args) {
        int i = 9;
        try{
            if(i<10){
                throw new MyException("Error");
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
}
