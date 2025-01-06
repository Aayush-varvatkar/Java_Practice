package Java_Practice;

public class Equal_HashCode1 {


        String name;
        int rollno;

        public Equal_HashCode1(String name, int rollno){
            this.name = name;
            this.rollno = rollno;
    }


    @Override
    public String toString(){
        return "{" + name + " : " + rollno + "}";
    }


    // @Override
    // public boolean equals(Object bj){
    //     if(this == bj){
    //         return true;
    //     }
    //     if(bj == null || bj.getClass() != this.getClass()){
    //         return false;
    //     }
    //     Equal_HashCode1 student = (Equal_HashCode1) bj;
    //     return (student.name.equals(this.name) && student.rollno == this.rollno);
    // }

    // @Override
    // public int hashCode(){
    //     return Objects.hash(name, rollno);
    // }
}
