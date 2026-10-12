package _31PracticeSet;
import java.util.Scanner;
public class _03Problem {
    public static int sum(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int ele : arr){
            sum += ele;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Arrays : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of Arrays : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(sum(arr));

    }
}
