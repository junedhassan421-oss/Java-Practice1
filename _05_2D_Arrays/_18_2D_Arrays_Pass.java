package _05_2D_Arrays;
import java.util.Scanner;
public class _18_2D_Arrays_Pass {
    public static int[][] fun(int brr[][]){
         for (int i=0;i<brr.length;i++){
             for (int j=0;j<brr.length;j++){
                 brr[i][j] = 0;

             }
         }
         return brr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the column : ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        /*fun(arr);*/
        /*for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }*/

        int brr[][] =    fun(arr);
        for (int i=0;i<brr.length;i++){
            for (int j=0;j<brr.length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
