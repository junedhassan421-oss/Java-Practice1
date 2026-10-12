package _03_Function;

import java.util.Scanner;

public class _09_Any_Base_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the In Base Multiplication : ");
        int b = sc.nextInt();

        System.out.print("Enter the 1sr Integer number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the 2nd Integer number : ");
        int n2 = sc.nextInt();


        int d = getproduct(b,n1,n2);
        System.out.print(d);

    }
    public static int getproduct(int b, int n1, int n2){
        int rv = 0;
        int p =1;
        while (n2>0){
            int d2 = n2%10;
            n2 = n2/10;

            int sp = getproductwithAsingleDigit(b,n1,d2);
            rv = getsum(b,rv,sp*p);
            p = p*10;

        }



        return rv;
    }
    public static int getproductwithAsingleDigit(int b, int n1, int d2){
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1>0 || c>0){
            int d1 = n1%10;
            n1 = n1/10;

            int d = d1*d2+c;
            c = d/b;
            d = d%b;

            rv = rv + d * p;
            p = p*10;

        }
        return rv;
    }
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
}
