package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _04_Base_Power {
    static int power(int a, int b ){
        if (b==0) return 1;
        if (a == 0) return 0;

        int x = a*power(a,b-1);
        return x;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int b = sc.nextInt();
        System.out.print("Enter power : ");
        int p = sc.nextInt();
        System.out.print( power(b,p));

    }
}
