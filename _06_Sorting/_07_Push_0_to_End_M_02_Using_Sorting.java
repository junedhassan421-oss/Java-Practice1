package _06_Sorting;
import java.util.Scanner;
public class _07_Push_0_to_End_M_02_Using_Sorting {
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
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
