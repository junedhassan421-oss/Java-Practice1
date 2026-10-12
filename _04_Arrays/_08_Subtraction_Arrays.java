package _04_Arrays;
import java.util.Scanner;
public class _08_Subtraction_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of 2nd arr : ");
        int a2[] = new int[n];
        for (int i=0;i<a2.length;i++){
            a2[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd Arrays : ");
        int m = sc.nextInt();
        System.out.print("Enter the elements of 1st arr : ");
        int a1[] = new int[m];
        for (int i=0;i<a1.length;i++){
            a1[i] = sc.nextInt();
        }

        int subtract[] = new int[n];
        int c = 0;
        int i = a1.length-1;
        int j = a2.length-1;
        int k = subtract.length-1;

        while (k>=0){
            int d = 0;
            int aiv = i >= 0? a1[i] : 0;    // ternary operator

            if (a2[j] + c >= aiv){
                d = a2[j] + c - aiv;
                c = 0;
            }
            else {
                d = a2[j] + c + 10 - aiv;
                c = -1;
            }
            subtract[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx<subtract.length){
            if (subtract[idx] == 0){
                idx++;            // 000001 -> 1 print
                                 // 000001234 -> 1234
            }
            else {
                break;
            }
        }
        while (idx<subtract.length){
            System.out.print(subtract[idx]);
            idx++;                            // 000001234 - > 1234
        }
    }
}
