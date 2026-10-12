package _05_2D_Arrays;

import java.util.Scanner;

public class _17_coordinates_sum_return_rectangle {
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
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("enter the coordinate of starting row :  ");
        int r1 = sc.nextInt();
        System.out.print("enter the coordinate of starting column : ");
        int l1 = sc.nextInt();
        System.out.print("enter the coordinate of ending row :  ");
        int r2 = sc.nextInt();
        System.out.print("enter the coordinate of ending column : ");
        int l2 = sc.nextInt();
        int sum = 0;
        for (int i=r1;i<=r2;i++){
            for (int j=l1;j<=l2;j++){
                sum += a1[i][j];
            }
        }
        System.out.print(sum+" ");

    }
}
