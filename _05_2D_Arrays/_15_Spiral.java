package _05_2D_Arrays;
import java.util.Scanner;
public class _15_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int r = sc.nextInt();
        System.out.print("Enter the column : ");
        int c = sc.nextInt();
        System.out.println("Enter the Element of Arrays : ");
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }

        }
        int minRow = 0;
        int maxRow = r-1;
        int minCol = 0;
        int maxCol = c-1;
        int tne = r*c;
        int count = 0;

        while (count<tne){
            for (int j=minCol;j<=maxCol;j++){
                System.out.print(arr[minRow][j]+" ");
                count++;
            }
            minRow++;
            if (count>tne) break;
            //System.out.println();
            for (int i=minRow;i<=maxRow;i++){
                System.out.print(arr[i][maxCol]+" ");
                count++;
            }
            maxCol--;
            if (count>tne) break;
            //System.out.println();
            for (int j=maxCol;j>=minCol;j--){
                System.out.print(arr[maxRow][j]+" ");
                count++;
            }
            maxRow--;
            if (count>tne) break;
           // System.out.println();
            for (int i=maxRow;i>=minRow;i--){
                System.out.print(arr[i][minCol]+" ");
                count++;
            }
            minCol++;
            if (count>tne) break;
            //System.out.println();

        }
    }
}
