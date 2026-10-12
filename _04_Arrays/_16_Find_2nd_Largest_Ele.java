package _04_Arrays;

import java.util.Scanner;

public class _16_Find_2nd_Largest_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int max = -1;
        int smax = -1;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                smax = max; // 2nd smax is now previous max
                max = arr[i];  // max is now a new max
            }
            else if (smax<arr[i] && max!=arr[i]){
               smax = arr[i];
            }
        }
        System.out.print(smax);

    }
}
