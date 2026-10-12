package _55ExceptionHandling;
import java.util.Scanner;
// Exception : Program ke execution ke time koi unexpected/abnormal situation aa jana, jisse normal flow disturb ho jata hai.
// Exception is a class in java that represents condition that a program may want to catch and handle and it form the parents class for many checked and uncheked exception
public class _01TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1000;
        int b = 0;
        //int c = a/b;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e){  // Catch Block
            System.out.println("We Failled to Divided : ");
            System.out.println(e);

        }
        //System.out.println(c);

    }
}
