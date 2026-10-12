package _04_Arrays;
import java.util.Scanner;
public class _26_Rotate_Arrays_K_time {
    public static void reverse(int arr[] , int si, int ei){
        for (int i=si, j=ei; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements of Arrays : ");
        int arr[] = new int[n];
        int m = arr.length;
        for (int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the rotate number : ");
        int k = sc.nextInt();
        k = k%m;
        reverse(arr,0,m-1);
        reverse(arr,0,k-1);
        reverse(arr,k,m-1);



        for (int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
