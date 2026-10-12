package _05_2D_Arrays;
import java.util.Scanner;
public class _02_AdditionTwo_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row of 1st matrix : ");
        int m = sc.nextInt();
        System.out.print("enter the column of 1st matrix : ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of 1st matrix : ");
        int a1[][] = new int[m][n];
        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a1.length;j++){
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.print("enter the row of 2nd matrix : ");
        int p = sc.nextInt();
        System.out.print("enter the column of 2nd matrix : ");
        int q = sc.nextInt();
        System.out.println("Enter the Elements of 2nd matrix : ");
        int a2[][] = new int[p][q];
        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a1.length;j++){
                a2[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int a3[][] = new int[n][p];
        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a1.length;j++){
                a3[i][j] = a1[i][j] + a2[i][j];
            }
        }
        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a1.length;j++){
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
