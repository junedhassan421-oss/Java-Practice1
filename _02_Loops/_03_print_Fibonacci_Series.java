package _02_Loops;
import java.util.Scanner;
public class _03_print_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;

        }
    }
}
