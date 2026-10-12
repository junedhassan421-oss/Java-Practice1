package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _11_Last_Occu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the data : ");
        int d = sc.nextInt();
        int size = arr.length;
        System.out.print(last_occ(arr,size-1,d));

    }
    public static int last_occ(int arr[], int idx , int val){
        if (idx<0){
            return -1;
        }
        if (arr[idx] == val) return idx;
        else {
            int lo = last_occ(arr,idx-1,val);
            return lo;
        }
    }
}
