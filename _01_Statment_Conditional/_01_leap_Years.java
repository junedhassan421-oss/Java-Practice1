package _01_Statment_Conditional;
import java.util.Scanner;
public class _01_leap_Years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n%4==0){
            System.out.print("year "+n+ " is leap year");
        }
        else System.out.print("this year is not leap year");
    }
}
