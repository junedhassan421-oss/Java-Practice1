package _02_Loops;
import java.util.Scanner;
public class _12_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int a = sc.nextInt();
        System.out.print("Enter the power : ");
        int b = sc.nextInt();

        int power = 1;
        for (int i=1;i<=b;i++){
            power *= a;
        }
        System.out.println(a+" Raised to the power " + b + " is "+power );
    }
}
