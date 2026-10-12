package _04_Arrays;
import java.util.Scanner;
public class _06_Bar_Chat {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter the element of arrays  : ");
        for (int i=1;i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int flor = max; flor >= 1;flor--){
            for (int i=1;i<arr.length;i++){
                if (arr[i] >= flor){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("  \t");
                }
            }
            System.out.println();
        }
    }
}
