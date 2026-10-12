package _05_2D_Arrays;
import java.util.Scanner;
public class _04_MAximum_Sum_of_Row {
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
        int x = 0;
        int idx = 0;
        for (int i=0;i<m;i++){
            int sum1 = 0;
            int sum2 = 0;

            for (int j=0;j<n;j++){
                if (i%2==0){
                    sum1 += a1[i][j];

                }else {
                    sum2 += a1[i][j];
                }
            }
            int a = sum1;
            int b = sum2;
            if (a > b ){
                x = a;
                idx = i;
            }
            else {
                x = b;
                idx = i;
            }
            System.out.println();
        }
        System.out.print("Row of index is "+ idx+ " total sum is " +x+" Greatest sum of all indexes" );

    }
}
