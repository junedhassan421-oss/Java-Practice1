package _06_Sorting;
import java.util.Scanner;
public class _02_Idx_sum_only_Sort_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements of arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        int i = 0;
        int j = n-1;
        while (i<j){
            if (arr[i] + arr[j] == target){
                System.out.print(i+" "+j);
                break;
            }
            else if (arr[i] + arr[j] > target){
                j--;
            }
            else if (arr[i] + arr[j] < target){
                i++;
            }
        }
    }
}
