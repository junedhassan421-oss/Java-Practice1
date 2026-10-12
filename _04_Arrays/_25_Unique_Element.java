package _04_Arrays;

import java.util.Scanner;

public class _25_Unique_Element {
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
            boolean flag = false;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    flag = true;
                }
            }
            if (flag == false){
                System.out.print(arr[i]+" is Unique Elements ");
                break;
            }
        }
    }
}
