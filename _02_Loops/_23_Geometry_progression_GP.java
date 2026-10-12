package _02_Loops;
import java.util.Scanner;
public class _23_Geometry_progression_GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // a = 1, r = 2;
        // an = a.r^n-1 -> 1.2^n-1
        //  1 2 4 8 16 32 ... up to n terms

        int a = 1, r = 2;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *= r;

        }
    }
}
