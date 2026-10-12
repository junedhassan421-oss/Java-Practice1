package _04_Arrays;

public class _02_Swap_idx_Value {
    public static void swap(int []arr,int i,int j){
        int tamp = arr[i];
        arr[i] = arr[j];
        arr[j] = tamp;
    }
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 35;
        arr[1] = 55;
        arr[2] = 65;
        arr[3] = 75;
        arr[4] = 85;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        swap(arr,0,4);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
