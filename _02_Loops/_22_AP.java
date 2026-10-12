package _02_Loops;
import java.util.Scanner;
public class _22_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        // 4 7 10 13 16 .... 3n+1;  // depending i idx
        /*for (int i=4;i<=3*n+1;i+=3){
            System.out.print(i+" ");
        }*/

        // not depend on i idx

        int a = 3, d = 4;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
