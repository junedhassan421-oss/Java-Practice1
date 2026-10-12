package _04_Arrays;
import java.util.Scanner;
public class _11_IDX_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<=arr.length-1;i++){
            if (i%2!=0) arr[i] *= 2;
            else arr[i] += 10;
            System.out.print(arr[i]+" ");
        }
    }
}
