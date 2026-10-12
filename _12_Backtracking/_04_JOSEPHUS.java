package _12_Backtracking;
import java.util.Scanner;
public class _04_JOSEPHUS {
    public static int solution(int n, int k){
        if (n==1){
            return 0;
        }
        int x = solution(n-1,k);
        int y = (x+k)%n;
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the cut number size : ");
        int k = sc.nextInt();
        System.out.println(solution(n,k));
    }
}
