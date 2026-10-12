package _02_Loops;
import java.util.Scanner;
public class _15_prime_Factorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number : ");
        int n = sc.nextInt();

        for (int i=2;i<=n;i++){
            while (n%i==0){
                n = n/i;
                System.out.print(i+" ");
            }
        }

    }
}
