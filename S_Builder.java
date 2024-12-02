package Java_Practice;

public class S_Builder {
    public static void main(String[] args) {
        StringBuilder Builder = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            Builder.append(ch);
        }
        System.out.println(Builder.toString());
    }
}
// Strings are immutable and they cannot be modified 
// String_Builder is mutable and can be modified