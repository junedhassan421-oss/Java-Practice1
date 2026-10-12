package _04_Arrays;
import java.util.Scanner;
public class _19_Check_Palindrome_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        int i = 0;
        int j = arr.length - 1;
        //int count = 0;
        while (i<j){
            if (arr[i] == arr[j]){
                System.out.print("Yes its palindrome ");
                //count++;
            }
            else {
                System.out.print("No its not palindrome");
                break;
            }
            i++;
            j--;
        }
        /*if (count == arr.length-1){
            System.out.print("Yes its palindrome ");
        }*/

    }
}
