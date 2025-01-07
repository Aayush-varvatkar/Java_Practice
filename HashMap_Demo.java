package Java_Practice;
import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {
    public static void main(String[] args) {
        
        HashMap<String, Integer> StudentInfo = new HashMap<>();
        StudentInfo.put("Aayush", 37);
        StudentInfo.put("Kazuto", 01);
        StudentInfo.put("Tyson", 02);
        StudentInfo.put("Dazai", 03);

        StudentInfo.put("Kazuto", 01);  // in this way- it will replace the value of the existing key     ( Since duplicate keys are not allowed)

        System.out.println(StudentInfo);

        System.out.println(StudentInfo.containsKey("Dazai"));  // returns true if the key is present
        System.out.println(StudentInfo.containsValue(02));

        System.out.println(StudentInfo.get("Kazuto"));    // returns the value of the key

        System.out.println(StudentInfo.remove("Dazai"));  // removes the key and value pair and returns the value



        if(!StudentInfo.containsKey("Tyson")){       // in this way-  the key will be added only if it is not present and won't override
            StudentInfo.put("Tyson", 00);
        }
        System.out.println(StudentInfo);

        StudentInfo.putIfAbsent("Kenji", 05);    //
        System.out.println(StudentInfo);




        // Iterating through the HashMap

        for(Map.Entry<String, Integer> entry : StudentInfo.entrySet()){
            System.out.println(entry);
        }
    }
}
