package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _02_Reverse_print {
    static void  print(int x){
        if (x==0){
            return;
        }
        System.out.print(x+" ");// reverse
        print(x-1);
        System.out.println();
        System.out.print(x+" ");  // unreverse
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        print(n);
    }
}
