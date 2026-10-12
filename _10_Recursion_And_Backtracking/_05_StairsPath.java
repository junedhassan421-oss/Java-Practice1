package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _05_StairsPath {
    public static int stairs(int n){
        /*if (n==1) return 1;
        if (n==2) return 2;
        if (n==3) return 3;*/

        /*if (n==1 || n==2 || n==3) return n;*/

        if (n<=3) return n;
        int st = stairs(n-1) + stairs(n-2) + stairs(n-3);
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(stairs(n));
    }
}
