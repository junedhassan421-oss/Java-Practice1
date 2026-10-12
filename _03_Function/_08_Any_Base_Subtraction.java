package _03_Function;
import java.util.Scanner;
public class _08_Any_Base_Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the In Base Addition : ");
        int b = sc.nextInt();

        System.out.print("Enter the 1sr Integer number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd Integer number : ");
        int n2 = sc.nextInt();


        int d = getsubtract(b,n1,n2);
        System.out.print(d);
    }
    public static int getsubtract(int b, int n1, int n2){
        int rv = 0;
        int c = 0;
        int p = 1;
        while (n2>0){
            int d1 = n1%10;
            n1 = n1/10;
            int d2 = n2%10;
            n2 = n2/10;

            int d = 0;
            d2 = d2 + c;

            if (d2>=d1){
                c = 0;
                d = d2 - d1;
            }
            else {
                c = -1;
                d = d2 + b - d1;
            }
            rv = rv + d * p;
            p = p*10;


        }
        return rv;
    }
}
