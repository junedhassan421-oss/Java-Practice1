package _06_Sorting;
import java.util.Scanner;
public class _01_Duplicate_Arr_M_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        /*int brr[] = new int[n];
        int idx = 0;
        for (int  i=0;i<arr.length;i++){
            idx = arr[i];
            brr[idx] = 1;
            if (idx == arr[i]){
                break;
            }
        }*/

        int x =  arr.length;
        int sum = 0;
        for (int i=0;i<x;i++){
            sum += arr[i];
        }
        int sn = x*(x+1)/2;
        int res = 0;

        if (sum>sn){
            res = sum - sn;
        }
        else {
            res = sn - sum;
        }

        System.out.print(arr[res]+" ");



    }
}
