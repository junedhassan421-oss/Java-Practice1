package _04_Arrays;
import java.util.Scanner;
public class _15_Find_2nd_Largest_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int smax = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=max && smax<arr[i]){
                smax = arr[i];
            }
        }
        System.out.print(smax);
    }
}
