package _31PracticeSet;
import java.util.Scanner;
public class _01Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the size of Arrays : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Elements of Arrays : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]*2+" ");
        }
    }
}
