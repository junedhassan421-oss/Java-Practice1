package _05_2D_Arrays;
import java.util.Scanner;
public class _08_Rotate_Matrix_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row of 1st matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of 1st matrix : ");
        int a1[][] = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        // 1st step > transpose matrix
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                // swap
                int temp = a1[i][j];
                a1[i][j] = a1[j][i];
                a1[j][i] = temp;
            }
            System.out.println();
        }
        // print
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        // Rotate 90 degree;
        for (int i=0;i<n;i++){
            int j=0;
            int k = n-1;
            while (j<k){
                // swap
                int temp = a1[i][j];
                a1[i][j] = a1[i][k];
                a1[i][k] = temp;
                j++;
                k--;
            }
            System.out.println();
        }
        // rotate print
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
