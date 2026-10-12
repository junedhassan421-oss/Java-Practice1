package _58PracticeSet;
import java.util.Scanner;
public class _01Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1;
        //  int a = 7

        /*int age = 78;
        int born = 2000-78;
        System.out.println(9/0);*/

        // problem 02;
        try {
            int a = 666/9;
        }
        catch (IllegalArgumentException e){
            System.out.println("Haaaa");
        }
        catch (ArithmeticException e){
            System.out.println("Hiiiii");
        }



        boolean flage = true;
        int []marks = new int[3];
        marks[0] = 7;
        marks[1] = 10;
        marks[2] = 15;
        int idx;
        int i = 0;
        while (flage && i<5){
           try {
               System.out.println("Enter the val of idx : ");
               idx = sc.nextInt();
               System.out.println("The val of marks is "+marks[idx]);
               //break;


           } catch (Exception e){
               System.out.println("Invalide idx");
               i++;
           }
        }
    }
}
