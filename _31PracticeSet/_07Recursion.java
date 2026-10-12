package _31PracticeSet;
import java.util.Scanner;
public class _07Recursion {
    public static int Factorial(int n){
        if (n < 0) {
            System.out.println("Factorial is Negative Number : ");
            return n;
        }
        if(n<=1) return 1;
        //if(n<=1) return n;
        return n*Factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n;
         System.out.println("Enter the Factorial Number : ");
         n = sc.nextInt();
         System.out.println(Factorial(n));
    }
}
