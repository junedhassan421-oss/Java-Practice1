package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _03_Sum {
   /* static void sum(int n, int s){
        if (n==0){
            System.out.print(s+" ");
            return;
        }
        sum(n-1,s+n);
    }*/
    static int prints(int n){
        if (n==1 || n==0) return 1;
        int ans = n+prints(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        /*sum(n,0);*/

        System.out.print(prints(n));


    }
}
