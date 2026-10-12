package _06_Sorting;

import java.util.Scanner;

public class _06_Push_0_to_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int x = sc.nextInt();
        System.out.print("Enter the elements of arrays : ");
        int  arr[] = new int[x];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();  /// {5,0,2,0,0,4,1,3,0} -> {5,2,4,1,3,0,0,0,0}
        }
        int n = arr.length;
        int brr[] = new int[n];
        int idx = 0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                brr[idx] = arr[i];
                idx++;
            }
            /*else {
                brr[idx] = arr[i];
                idx++;
            }*/
            /*while (idx!=n){
                brr[idx] = 0;
                idx++;
            }*/
        }
        for (int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
