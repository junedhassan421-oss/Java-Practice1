package _02_Loops;
import java.util.Scanner;
public class _18_Benjamin_Bulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.print(i * i+" ");
        }
    }
}
