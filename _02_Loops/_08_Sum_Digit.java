package _02_Loops;
import java.util.Scanner;
public class _08_Sum_Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number : ");
        int n = sc.nextInt();

        //int sum = 0;
        int product = 1;
        int lastDigit = 0;

        while (n!=0){
            lastDigit = n%10;
           // sum +=lastDigit; // sum = sum + lastDigit
            product *= lastDigit;
            /*if (lastDigit%2==0){
                product *= lastDigit;
            }*/
            //System.out.println(sum);
            n /= 10; //n = n/10;
        }
        //System.out.println(sum);
        System.out.println(product);
    }
}
