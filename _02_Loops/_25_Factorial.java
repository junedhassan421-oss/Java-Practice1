package _02_Loops;
import java.util.Scanner;
public class _25_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        //int fact = 1;
        long fact = 1;
        for (int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
        System.out.println(Integer.MAX_VALUE);
    }
}
