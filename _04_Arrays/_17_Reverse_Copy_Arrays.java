package _04_Arrays;

public class _17_Reverse_Copy_Arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int brr[] = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            brr[i] = arr[6-i];
        }

        /*for (int i=0;i<arr.length;i++){
            arr[i] = brr[i];
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

        for (int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
