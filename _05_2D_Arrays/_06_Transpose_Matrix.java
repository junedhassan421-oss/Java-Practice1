package _05_2D_Arrays;
import java.util.Scanner;
public class _06_Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row of 1st matrix : ");
        int m = sc.nextInt();
        System.out.print("enter the column of 1st matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of 1st matrix : ");
        int a1[][] = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a1[i][j] = sc.nextInt();
            }
        }

        // transpose but not anywhere store
        /*for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(a1[j][i]+" ");
            }
            System.out.println();
        }*/

        // transpose and in any arrays stored
        int brr[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
               brr[i][j] = a1[j][i];
            }
            System.out.println();
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
