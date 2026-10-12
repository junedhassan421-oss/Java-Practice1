package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _10_1st_IDX_Arr {
    public static int search(int arr[], int idx , int data){
        if (idx==arr.length) return -1;
        if (arr[idx] == data) return idx;
        else {
            int fi = search(arr,idx+1,data);
            return fi;
        }
        //int fi = search(arr,idx+1,data);
        /*if (arr[idx] == data) return idx;
        else return fi;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements : ");
        int a[] = new int[n];
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the data : ");
        int d = sc.nextInt();
        System.out.print(search(a,0,d));
    }
}
