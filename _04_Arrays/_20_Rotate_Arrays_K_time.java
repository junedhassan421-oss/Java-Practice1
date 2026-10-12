package _04_Arrays;
import java.util.Scanner;
public class _20_Rotate_Arrays_K_time {
    public static void reverse(int arr[], int si, int ei){
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
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the rotate K :  ");
        int k = sc.nextInt();
        int m = arr.length;
        k = k%m;
        reverse(arr,0,m-1);
        reverse(arr,0,k-1);
        reverse(arr,k,m-1);



        /*for (int i=0,j=k-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i=k,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/


        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
