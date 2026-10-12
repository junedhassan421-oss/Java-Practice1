package _04_Arrays;
import java.util.Scanner;
public class _23_Find_Missing_Elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int m = arr.length;
        int sum1 = 0;
        for (int i=0;i<=m-2;i++){
            sum1 += arr[i];
        }
        int sum2 = m*(m+1)/2;
        int res = sum2 - sum1;
        System.out.print(res);
    }
}
