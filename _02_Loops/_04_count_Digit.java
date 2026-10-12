package _02_Loops;
import java.util.Scanner;
public class _04_count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer No: ");
        int n = sc.nextInt();
        int digit =0;
        while (n!=0){
            n /=10;
            digit++;
        }
        System.out.println(digit);

    }
}
