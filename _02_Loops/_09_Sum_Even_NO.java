package _02_Loops;
import java.util.Scanner;
public class _09_Sum_Even_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of number : ");
        int n = sc.nextInt();
        System.out.print("Enter your integer number : ");
        int sum = 0;
        for (int i=0;i<n;i++){
            int m = sc.nextInt();
            if(m%2==0){
                sum += m;
            }

        }
        System.out.print(sum);
    }
}
