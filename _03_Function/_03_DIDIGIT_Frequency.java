package _03_Function;
import java.util.Scanner;
public class _03_DIDIGIT_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number : ");
        int n = sc.nextInt();
        System.out.print("Enter the find number : ");
        int d = sc.nextInt();
        int f = getDigitfrequency(n,d);
        System.out.print(f);
    }

    public static int getDigitfrequency(int n,int d){
        int rv = 0;
        while (n>0){
            int digit = n%10;
            n = n/10;

            if(digit==d){
                rv++;
            }
        }
        return rv;
    }
}
