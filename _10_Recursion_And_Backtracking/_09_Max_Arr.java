package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _09_Max_Arr {
    public static int maxarr(int arr[], int idx){
        if (idx == arr.length) return 1;
        int pre = maxarr(arr,idx+1);
        if (pre>arr[idx]){
            return pre;
        }
        else return arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        System.out.print(maxarr(a,0));
    }
}
