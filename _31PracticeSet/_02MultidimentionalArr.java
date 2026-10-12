package _31PracticeSet;
import java.util.Scanner;
public class _02MultidimentionalArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of 1st Arrays : ");
        n = sc.nextInt();
        int m;
        System.out.println("Enter the 2nd size of Arrays : ");
        m = sc.nextInt();

        int arr[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
