package _05_2D_Arrays;

import java.util.Scanner;

public class _16_Maximum_Ele {
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
        int min = Integer.MAX_VALUE;
        int idxi = 0;
        int idxj = 0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (a1[i][j]<min){
                    min = a1[i][j];
                    idxi = i;
                    idxj = j;
                }
            }
        }
        System.out.print(min);
        System.out.println();
        System.out.print(idxi+","+idxj);
    }
}
