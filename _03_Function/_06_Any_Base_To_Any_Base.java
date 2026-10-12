package _03_Function;
import java.util.Scanner;
public class _06_Any_Base_To_Any_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Base : ");
        int b1 = sc.nextInt();
        System.out.print("Enter the 2nd Base : ");
        int b2 = sc.nextInt();
        int ans = getvalue(n,b1,b2);
        System.out.print(ans);

    }
    public static int getvalue(int n, int b1, int b2){
        int dec = anybasetodec(n,b1);
        int dn = decimaltoanybase(dec,b2);
        return dn;
    }
    public static int decimaltoanybase(int n, int b){
        int rv = 0;
        int p = 1; // 10^0
        while (n>0){
            int dig = n%b;
            n = n/b;

            rv += dig*p;
            p = p*10;
        }
        return rv;
    }
    public static int anybasetodec(int n, int b){
        int rv = 0;
        int p = 1; // 10^0
        while (n>0){
            int dig = n%10;
            n = n/10;

            rv += dig*p;
            p = p*b;  // 10^1; 10^2; 10^3; ........
        }
        return rv;
    }
}
