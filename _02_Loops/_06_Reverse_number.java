package _02_Loops;
import java.util.Scanner;
public class _06_Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int rev = 0;

        /*while (n>0){
            rev = n%10;
            System.out.print(rev+" ");
            n = n/10;
        }*/
        
        while (n!=0){
            int lastdigit = n%10;
            rev *= 10;
            rev += lastdigit;
            n/=10;
        }
        System.out.println(rev);
        System.out.println(rev+n);
    }
}
