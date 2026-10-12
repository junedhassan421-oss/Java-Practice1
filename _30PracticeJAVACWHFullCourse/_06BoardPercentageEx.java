package _30PracticeJAVACWHFullCourse;
import java.util.Scanner;
public class _06BoardPercentageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Maths : ");
        int m = sc.nextInt();
        System.out.println("Enter the Marks of Physics : ");
        int p = sc.nextInt();
        System.out.println("Enter the Marks of Chemistry : ");
        int c = sc.nextInt();
        System.out.println("Enter the Marks of Biology  : ");
        int b = sc.nextInt();
        System.out.println("Enter the Marks of Urdu : ");
        int u = sc.nextInt();

        float results = (m+p+c+b+u)/5;
        System.out.println("Your Total Percentage is : " + results+"%");

    }
}
