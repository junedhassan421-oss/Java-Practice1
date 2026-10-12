package _05_2D_Arrays;

import java.util.Scanner;

public class _18_Max_ele_in_Row_idx_M_02 {
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
        int max_sum = Integer.MIN_VALUE;
        int idx = 0;
        for (int i=0;i<m;i++){
            int sum = 0;
            for (int j=0;j<n;j++){
                sum += a1[i][j];
            }
            if (max_sum<sum){
                max_sum = sum;
                idx = i;
            }
        }
        System.out.println("maximum sum of Row index is : "+ idx);
        System.out.println("maximumsum is : "+max_sum);
    }
}
