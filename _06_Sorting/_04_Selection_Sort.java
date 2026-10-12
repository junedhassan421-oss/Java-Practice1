package _06_Sorting;
import java.util.Scanner;
public class _04_Selection_Sort {
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
        // Selection Sort
        for (int i=0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j=i;j<=n-1;j++){
                if (min>arr[j]){
                    min = arr[j];
                    minidx = j;
                }

            }
            // swap the min elem and first ele of unsorted part
            // swap min_idx to i
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
