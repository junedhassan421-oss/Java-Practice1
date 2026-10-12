package _02_Loops;
import java.util.Scanner;
public class _24_Highest_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int hf = 1;
        for (int i=n-1;i>=1;i--){
            if (n%i==0){
                hf = i;
                break;
            }
        }
        System.out.print(hf);
    }
}
