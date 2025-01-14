package Java_Practice;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling {
    public static void main(String[] args) {

        // Create a file
        /*
         * File myfile = new File("Java_Practice/CreatedFile.txt");
         * try {
         * myfile.createNewFile();
         * }
         * catch(IOException e){
         * System.out.println("unable to create this file");
         * e.printStackTrace();
         * }
         */

        // Write in a file

        try {
            FileWriter writeinFile = new FileWriter("Java_Practice/CreatedFile.txt");
            writeinFile.write(
                    "This File in created by File Halndling method in java \n all operations in this file are done by java code");
            writeinFile.close();
        } catch (IOException e) {
            System.out.println("unable to write in this file");
            e.printStackTrace();
        }

        // Read a file

        File readMyFile = new File("Java_Practice/CreatedFile.txt");
        try {
            Scanner sc = new Scanner(readMyFile);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
                sc.close();
            }
        } catch (IOException e) {
            System.out.println("Unable to read this file");
            e.printStackTrace();
        }

        // delete a file

        File deleteMyFile = new File("Java_Practice/CreatedFile.txt");
        if (deleteMyFile.delete()) {
            System.out.println("File is deleted successfully" + deleteMyFile.getName());
        } else {
            System.out.println("Unable to delete this file");
        }

    }
}
