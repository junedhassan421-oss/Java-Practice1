package _04_Arrays;
import java.util.Scanner;
public class _22_Is_Present_Ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Searching Elements :  ");
        int x = sc.nextInt();
        int idx = 0;
        boolean flag = false;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                flag = true;
                idx = i;
                break;
            }
        }
        if (flag == false){
            System.out.print( x+ " is not present in the arrays ");
        }
        else {
            System.out.print(x+ " is present in the arrays and its index is " + idx);
        }

    }
}
