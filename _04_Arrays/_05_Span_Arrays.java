package _04_Arrays;
import java.util.Scanner;
public class _05_Span_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = sc.nextInt();

        System.out.print("Element of arrays : ");
        int arr[] = new int[n];
        for (int i=1;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
