package _02_Loops;
import java.util.Scanner;
public class _16_prime_Factorization_M_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number : ");
        int n = sc.nextInt();

        for (int i=2;i*i<=n;i++){
            while (n%i==0){
                n = n/i;
                System.out.print(i+" ");
            }
        }
        if(n!=1){
            //System.out.print(n);
            System.out.print(n);
        }
    }
}
