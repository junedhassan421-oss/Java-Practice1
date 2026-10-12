package _02_Loops;
import java.util.Scanner;
public class _11_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();

        // fibonacci -> 0 1 1 2 3 5 7 13 21 34 55 89 ......
        // term/idx  -> 1 2 3 4 5 6 7 8  9  10 11 12  ......
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i=1;i<=n-2;i++){
            sum = a + b;
            a = b;
            b = sum;

        }
        System.out.print(sum);
    }
}
