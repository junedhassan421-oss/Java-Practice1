package _05_2D_Arrays;

import java.util.Scanner;

public class _07_Transpose_Without_Extra_arr {
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

        // transpose and in any arrays stored without using extra arrays  // this method work only square matrix
        for (int i=0;i<m;i++){
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
            for (int j=0;j<m;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

    }
}

