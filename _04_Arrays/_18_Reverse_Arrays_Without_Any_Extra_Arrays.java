package _04_Arrays;
import java.util.Scanner;
public class _18_Reverse_Arrays_Without_Any_Extra_Arrays {
    public static void reverse(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        // for(int i = 0,j = arr.length - 1; i < j; i++, j--){
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
        System.out.print("Enter the size of arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
