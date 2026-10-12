package _05_2D_Arrays;
import java.util.Scanner;
public class _01_Declaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the row : ");
        int n = sc.nextInt();
        System.out.print("enter the column : ");
        int m = sc.nextInt();

        System.out.println("Enter the element : ");
        int arr[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("("+i+","+j+")");
            }
            System.out.println();
        }
        System.out.print("Enter the searching Element : ");
        int x = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (arr[i][j] == x){
                    System.out.print("IDX of " + x + " is : "+"("+ i+ ","+ j+")");
                }
            }
        }

    }
}
