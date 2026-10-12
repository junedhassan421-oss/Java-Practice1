package _06_Sorting;
import java.util.Scanner;
public class _03_Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of arrays : ");
        int  arr[] = new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        /*for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<=arr.length-2;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/

        for(int i=0;i<arr.length-1;i++){
            boolean flag = true; // arrays is not sorted yet
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){  // acending order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;

                }

                /*if (arr[j] < arr[j+1]){  // Decending order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                } */


            }
            if(flag == true) break;
            System.out.print(flag+" ");
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
