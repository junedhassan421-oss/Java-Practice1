package _32Oops;
import java.util.Scanner;
public class _01Class {
    static class Information{
        String name;
        int age;
        int Id;
        String UniversityName;
        int RollNo;


        int sum(int a , int b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Information cl1 = new Information();
        cl1.name = "junaid";
        System.out.println(cl1.name);

        int s = cl1.sum(7,9);
        System.out.println(s);



    }
}
