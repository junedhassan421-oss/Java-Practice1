package _000String;
import java.util.Scanner;
public class _06CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        String str = "";
        str += n;
        System.out.println(str.length());

        double s = 3.144;
        String str2 = "";
        str2 += s;
        System.out.println(str2.length());

        String str3 = "7567854";
        int n1 = Integer.parseInt(str3);
        System.out.println(n1+1);

    }
}
