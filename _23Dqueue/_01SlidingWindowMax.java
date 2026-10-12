package _23Dqueue;
import java.util.Deque;
import java.util.Scanner;
public class _01SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays : ");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the window size : ");
        int k = sc.nextInt();
        Deque<Integer>d = null;
        int arr[] = new int[num.length-k];
        for (int i=0;i<k-1;i++){
            if (d.isEmpty()){
                d.push(i);
            }
            else {
                while (!d.isEmpty()&&num[i]>num[d.peekLast()]){
                    d.pollLast();
                }
                d.push(i);
            }
        }
        System.out.print(d+" ");
        //int arr[] = slidingWindow(num,k);
//        for (int i=0;i<arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//        }
//        slidingWindow(num,k);


    }

   /* public void []slidingWindow(int[] num, int k) {
        Deque<Integer> d = null;
        int arr[] = new int[num.length - k];
        for (int i = 0; i < k - 1; i++) {
            if (d.isEmpty()) {
                d.push(i);
            } else {
                while (!d.isEmpty() && num[i] > num[d.peekLast()]) {
                    d.pollLast();
                }
                d.push(i);
            }
        }
    }   */

}
