package _02_Loops;
import java.util.Scanner;
public class _10_print_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Factorial number : ");
        int n = sc.nextInt();
        int product = 1;
        for (int i=n;i>=1;i--){
            product *=i;

        }
        //System.out.println(product);
        System.out.println(n+"!"+" = "+product);

    }
}
