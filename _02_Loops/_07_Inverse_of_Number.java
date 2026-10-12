package _02_Loops;
import java.util.Scanner;
public class _07_Inverse_of_Number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("enter integer number : ");
        int n = sc.nextInt();

        int inv = 0;
        int op = 1; // op (original place ) // od = original digit
        while (n!=0){
            int od = n%10;
            int id = op;
            int ip = od;

            // make change to inv using ip and id
            inv = inv + id*(int)Math.pow(10,ip-1);


            n = n/10;
            op++;

        }
        System.out.println(inv);
    }
}
