package _05_2D_Arrays;

import java.util.Scanner;

public class _09_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row of 1st matrix : ");
        int r1 = sc.nextInt();
        System.out.print("enter the column of 1st matrix : ");
        int c1 = sc.nextInt();
        System.out.println("Enter the Elements of 1st matrix : ");
        int a1[][] = new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("enter the row of 2nd matrix : ");
        int r2 = sc.nextInt();
        System.out.print("enter the column of 2nd matrix : ");
        int c2 = sc.nextInt();
        System.out.println("Enter the Elements of 2nd matrix : ");
        int a2[][] = new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                a2[i][j] = sc.nextInt();
            }
        }
        // check
        if (c1 != r2){
            System.out.print("The Matrix can not be multiplied");

        }

        else {
            // multiplication
            int res[][] = new int[r1][c2];
            for (int i=0;i<r1;i++){
                for (int j=0;j<c2;j++){
                    res[i][j] = 0;
                    for (int k=0;k<r2;k++){
                        res[i][j] += a1[i][k] * a2[k][j];
                    }
                }
            }
            System.out.println("The Resultant Matrix is : ");
            for (int i=0;i<r1;i++){
                for (int j=0;j<c2;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
