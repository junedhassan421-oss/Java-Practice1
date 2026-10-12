package _02_Loops;
import java.util.Scanner;
public class _05_Number_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integer number : ");
        int n = sc.nextInt();
        int nod = 0;
        int temp = n;

        while (temp!=0){
            temp = temp/10;
            nod++;
        }
        int div = (int)Math.pow(10,nod-1);  // if node -> 5 -> 10000
        while (div!=0){  // if n -> 12345
            int q = n/div; // 1.2345 -> 1
            System.out.println(q);

            n = n%div; // 2345 ( 1 delete )
            div = div/10; // 10000/10 - > 1000
        }


    }
}
