package _66AdvanceJava;
import javax.print.DocFlavor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class _02WriteTableinFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        /*int n = sc.nextInt();
        int i = n;*/
        /*File file = new File("MultipleTable1.txt");
        try {
            file.createNewFile();
        } catch (IOException e){
        System.out.println("Enable to Create This File");
             e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("MultipleTable1.txt");
            fw.write("This is a First file from the java course :\n ok now by ");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }*/

        int n = sc.nextInt();
        int i = n;
        String table = "";
        for(int j=1;j<=10;j++){
            table += i + "X" + j + "=" + i*j;
            table += "\n";
        }
        try {
            FileWriter fw = new FileWriter("MultipleTable2.txt");
            fw.write(table);
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }



    }
}
