package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _08_Display_Arr {
    public static void Display(int a[], int idx){
        if (idx == a.length) return;
        System.out.print(a[idx]+" ");
        Display(a,idx+1);
        System.out.println();
        System.out.print(a[idx]+" ");  // reverse print
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arr : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Display(arr,0);
    }
}
