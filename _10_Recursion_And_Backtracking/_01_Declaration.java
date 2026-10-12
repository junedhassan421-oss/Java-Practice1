package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _01_Declaration {
    /*static  void print(int x,int n){
        //''''''''''''''''''''''''''''''''''''
        if (x>n){
            return;
        }
        System.out.println(x);
        print(x+1,n);

    }*/
    static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        /*print(1,n);*/
        print(n);
    }
}
