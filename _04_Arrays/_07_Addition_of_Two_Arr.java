package _04_Arrays;
import java.util.Scanner;
public class _07_Addition_of_Two_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of 1st arr : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd Arrays : ");
        int m = sc.nextInt();
        System.out.print("Enter the elements of 2nd arr : ");
        int brr[] = new int[m];
        for (int i=0;i<brr.length;i++){
            brr[i] = sc.nextInt();
        }

        int sum[] = new int[n>m? n:m];
        /*int sum[] = new int[arr.length];*/
        int c = 0;
        int i = arr.length-1;
        int j = brr.length-1;
        int k = sum.length-1;

        while (k>=0){
            int d = c;

            if (i>=0){
                d += arr[i];

            }
            if (j>=0){
                d += brr[j];
            }

            c = d/10;
            d = d%10;

            sum[k] = d;
            i--;
            j--;
            k--;

        }
        if (c != 0){
            System.out.print(c);
        }
        for (int val : sum){
            System.out.print(val+" ");
        }
        /*for (int p=1;p<sum.length;p++){
            System.out.print(sum[p]+" ");
        }*/

    }
}
