package _12_Backtracking;
import java.util.Scanner;
public class _05_Lexicographical_Order {
    public static void dfs(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        for (int j=0;j<10;j++){
            dfs(10*i+j,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        for (int i=1;i<=9;i++){
            dfs(i,n);
        }
    }
}
