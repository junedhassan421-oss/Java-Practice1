package _04_Arrays;
import java.util.Scanner;
public class _12_Greater_Ele_Of_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the Search greater than Element : ");
        int x = sc.nextInt();
        int max = x;
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
                /*System.out.print(arr[i]);*/
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
