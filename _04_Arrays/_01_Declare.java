package _04_Arrays;
import java.util.Scanner;
public class _01_Declare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 11;
        arr[5] = 15;
        System.out.print(arr.length);
        System.out.println();
        for (int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the searching number : ");
        int x = sc.nextInt();
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                System.out.println(" found of "+x+" is idx : "+i);
            }
        }


    }
}
