package _02_Loops;
import java.util.Scanner;
public class _17_Pythagorean_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();

        int max = a;
        if(b>=max){
            max = b;
        }
        if (c>=max){
           max = c;
        }
        if (max==a){
            boolean flag = (b*b + c*c) == (a*a);
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag = (a*a + c*c) == (b*b);
            System.out.println(flag);
        }
        else {
            boolean flag = (b*b + a*a) == (c*c);
            System.out.println(flag);
        }

    }
}
