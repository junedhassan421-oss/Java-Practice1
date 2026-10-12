package _02_Loops;
import java.util.Scanner;
public class _13_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total integer number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Rotate number : ");
        int k = sc.nextInt();

        int temp = n;
        int size = 0;
        while (temp>0){
            temp = temp/10;
            size++;
        }
        k = k%size;
        if (k<0){
            k = k + size;
        }
        int div = 1;
        int mult = 1;
        for (int i=1;i<=size;i++){
            if (i <= k){
                div = div*10;
            }
            else {
                mult = mult*10;
            }
        }
        int q =  n/div;
        int r = n%div;

        int rotate = r*mult+q;
        System.out.print(rotate+" ");

    }
}
