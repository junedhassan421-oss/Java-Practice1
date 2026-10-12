package _05_2D_Arrays;

import java.util.Scanner;

public class _10_Spiral {
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
            if (i%2==0){
                for (int j=0;j<n;j++){
                    System.out.print(a1[i][j]+" ");
                }
            }
            else {
                for (int j=n-1;j>=0;j--){
                    System.out.print(a1[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
