package _04_Arrays;
import java.util.Scanner;
public class _04_find_Element_in_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the searching element : ");
        int x = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                System.out.print(i);
            }
        }

    }
}
