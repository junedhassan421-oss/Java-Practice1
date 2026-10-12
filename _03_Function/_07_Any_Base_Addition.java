package _03_Function;
import java.util.Scanner;
public class _07_Any_Base_Addition {
    public static int getsum(int b,int n1, int n2){
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1>0 || n2>0 || c>0){
            int dig1 = n1%10;
            int dig2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int dig = dig1 + dig2 + c;
            c = dig/b; // 8
            dig = dig%b;

            rv += dig*p;
            p = p*10;

        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the In Base Addition : ");
        int b = sc.nextInt();

        System.out.print("Enter the 1sr Integer number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd Integer number : ");
        int n2 = sc.nextInt();


        int d = getsum(b,n1,n2);
        System.out.print(d);
    }
}
