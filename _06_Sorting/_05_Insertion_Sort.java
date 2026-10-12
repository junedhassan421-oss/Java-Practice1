package _06_Sorting;
import java.util.Scanner;
public class _05_Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int x = sc.nextInt();
        System.out.print("Enter the elements of arrays : ");
        int  arr[] = new int[x];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.println(n);

        for (int i=1;i<=n-1;i++){
            int j = i;
            while (j>=1 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }


    }
}
