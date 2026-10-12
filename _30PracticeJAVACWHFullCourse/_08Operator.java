package _30PracticeJAVACWHFullCourse;
import java.util.Scanner;
public class _08Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Operant , Operator , Operant  = results [ 4 + 2 = 6 ]

        // Type Of Operator :
        /*Arithmetic Operator     : +,-,*,/,%,++,--
        Assignment Operator      : =, +=, -=, /=, *=
        Congressional Operator  : == , >=, <=,
        Logical Operator       : &&, ||, !, ^
        Bitwise Operator      : &, |, ^, ~, !  */


        int a = 10 - 'A';
        //int b = 10 - A;
        System.out.println(a);
        //System.out.println(b);

        System.out.println(70%'A');
        System.out.println('A' == 'A');
        int num1 = 'a' + 1;
        int num2 = 'A' + 33;
        System.out.println(num1 == num2);
        System.out.println(64>5 && 64>8);

    }
}
