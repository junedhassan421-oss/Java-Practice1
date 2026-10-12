package _0Practice.Basic;
import java.util.Scanner;
public class _01CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.println("enter the PN : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count ++;
            }
        }
        if(count == 2) {
            System.out.println("This number is prime ");
        }
        else{
            System.out.println("This number is not prime ");
        }
    }
}
