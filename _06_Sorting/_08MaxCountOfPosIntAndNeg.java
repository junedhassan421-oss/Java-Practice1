package _06_Sorting;
import java.util.Scanner;
public class _08MaxCountOfPosIntAndNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of in this arrays : ");
        int arr[] = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxCountofposIntandNegInt(arr,n));

    }
    public static int maxCountofposIntandNegInt(int arr[], int size){
        // MaximumNegCount
        int lo = 0;
        int hi = size-1;
        int NegCount = 0;
        while (lo<=hi){
            int m = lo+(hi-lo)/2;
            if (arr[m]>0) hi = m-1;
            else lo = m+1;
        }
        NegCount = lo;
        // Cont positive
        lo = 0;
        hi = size-1;
        int posCount= 0;
        while (lo<=hi){
            int m = lo+(hi-lo)/2;
            if (arr[m]<0)  lo = m+1;
            else hi = m-1;

        }
        posCount = size - lo;
        return Math.max(posCount,NegCount);

    }
}
