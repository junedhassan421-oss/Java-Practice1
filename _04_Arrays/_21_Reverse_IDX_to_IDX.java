package _04_Arrays;
import java.util.Scanner;
public class _21_Reverse_IDX_to_IDX {
    public static void revverse(int arr[], int m , int n){
        int i = m;
        int j = n;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the 1st idx ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd idx ");
        int b = sc.nextInt();
        revverse(arr,a,b);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
