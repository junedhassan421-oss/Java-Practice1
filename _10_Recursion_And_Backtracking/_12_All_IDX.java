package _10_Recursion_And_Backtracking;
import java.io.*;
public class _12_All_IDX {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] =  Integer.parseInt(br.readLine());
        }

        System.out.print("Enter the data : ");
        int d =  Integer.parseInt(br.readLine());

        int[] iarr = allidx(arr, d, 0, 0);

        if (iarr.length == 0){
            System.out.println();
            return;
        }
        for (int i=0;i<iarr.length;i++){
            System.out.print(iarr[i]+" ");
        }
    }
    public static int[] allidx(int[] arr, int x, int idx, int fsf){
        if (idx == arr.length){
            return new int[fsf];
        }
        if (arr[idx] == x){
            int[] iarr =  allidx(arr,x,idx+1,fsf+1);
            iarr[fsf] = idx;
            return iarr;
        }
        else {
            int[] iarr =  allidx(arr,x,idx+1,fsf);
            return iarr;
        }
    }
}
