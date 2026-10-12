package _65FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*Reading from And Writing to files is an important aspect of Any Programming Language
* We Can Use the files Class in java to Create a files Objects
* 1> Create New File() method : Create a file objects
* 2.> Write file : Jis file me write krna chahte ho us file ka object bnao : File write = new FIle("File Name")
* 3.> For r reading file we can use the some Scanner Class And Suplly it a file objects
* 4.> To Delete a file in java we can use file objects Delete() Method */

public class _01FileHandling {
    public static void main(String[] args) /*throws Exception*/{
        Scanner sc = new Scanner(System.in);
        File myfile = new File("FileHandling.txt"); // just create a object not file

        // Code to Create a new file
       /* try {
            myfile.createNewFile();
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }*/

        // // Code to Create a new file
     /*   try {
            myfile.createNewFile();
        } catch (IOException e){
            System.out.println("Enable to Create This File");
            e.printStackTrace();
        }*/

        // Code to Write in files
       /* try {
            FileWriter fw = new FileWriter("FileHandling.txt");
            fw.write("This is a First file from the java course :\n ok now by ");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/
        // Reading a file
//        File file = new File("FileHandling.txt");
//        try {
//            Scanner read = new Scanner(file);
//            while (read.hasNextLine()){
//                /*String line = read.nextLine();
//                System.out.println(line);*/
//                System.out.println(read.nextLine());
//            }
//            read.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
      /* try {
            Scanner read = new Scanner(myfile);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/

       /* Scanner read = new Scanner("java.txt");
        while (read.hasNextLine()){
            System.out.println(read.nextLine());
        }
        read.close();*/

      /*  File myfile1 = new File("java.txt");
        try {
            Scanner read = new Scanner(myfile1);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }*/

//        File myfile2 = new File("This.txt");
//        try {
//            Scanner read = new Scanner(myfile2);
//            while (read.hasNextLine()){
//                System.out.println(read.nextLine());
//            }
//            read.close();
//        }
//        catch (/*FileNotFoundException*/  IOException e) {
//            e.printStackTrace();
//        }

        File f = new File("this.txt");
        if(f.delete()){
            System.out.println("I have deleted The This file : "+f.getName());
        }
        else {
            System.out.println("Some Error Occurs While Deleting the file : "+f.getName());
        }
    }
}
