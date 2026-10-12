package _30PracticeJAVACWHFullCourse;
import java.util.Scanner;
public class _09AssociativityPrecidents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Precedence & Associativity */
        // / == * [left to right]
        // - == + [left to right]
        // ++, =  [right to left]

        int a = 6*5-34/2;// 13
        //30-34/2 : 30-17 = 13
        System.out.println(a);

        int x = 8;
        int y = 5;
        int k = x*y/2;  // 8*5/2 : left to right : 40/2 = 20;
        System.out.println(k);

        int b = 1;
        int c = 4;
        int a1 = 5;
        int k1 = b*b - 4*a1*c/2*a1;  // -199
        System.out.println(k1);

        int k2 = b*b - (4*a1*c)/(2*a1);  // -199
        System.out.println(k1);
    }
}
