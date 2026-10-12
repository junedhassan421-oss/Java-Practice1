package _05_2D_Arrays;
import java.util.Scanner;
public class _03_Find_Sumof_All_Ele_In_Arr {
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
        int sum = 0;
        for (int i=0;i<a1.length;i++){
            for (int j=0;j<a1.length;j++){
                sum += a1[i][j];
            }
        }
        System.out.print(sum);
    }
}
