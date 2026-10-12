package _30PracticeJAVACWHFullCourse;
import java.util.Scanner;
public class _10DataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9;
        System.out.println(++a);  // increments
        System.out.println(a++);
        System.out.println(a);
        int b = a++;
        System.out.println(b);

        int i = 11;
        int j = i ++;
        System.out.println(j);
    }
}