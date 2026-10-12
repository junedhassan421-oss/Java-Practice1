package _04_Arrays;

import java.util.Scanner;

public class _14_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of Arrays : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the Search pairs Element : ");
        int x = sc.nextInt();

        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k] == x){
                        count++;
                        System.out.printf("(%d,%d,%d)\n",arr[i],arr[j],arr[k]);

                    }
                }
            }
        }
        System.out.print(count);
    }
}
