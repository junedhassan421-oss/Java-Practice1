package _04_Arrays;

import java.util.Scanner;

public class _24_Duplicate_Elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size if arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the Elements : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i]+" is duplicate Element ");
                    break;
                }
            }
        }
    }
}
