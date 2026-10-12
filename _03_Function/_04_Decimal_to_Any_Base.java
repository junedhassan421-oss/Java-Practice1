package _03_Function;
import java.util.Scanner;
public class _04_Decimal_to_Any_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter base : ");
        int b = sc.nextInt();

        int dn = getvalueinbase(n,b);
        System.out.print(dn);
    }

    public static int getvalueinbase(int n, int b){
        int rv = 0;
        int p = 1; // 10^0
        while (n>0){
            int dig = n%b;
            n = n/b;

            rv += dig*p;
            p = p*10;  // 10^1; 10^2; 10^3; ........
        }
        return rv;
    }
}
