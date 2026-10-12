package _01_Statment_Conditional;
import java.util.Scanner;
public class _03_area_and_rectangle_of_parameter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length : ");
        int a = sc.nextInt();
        System.out.print("enter breadth : ");
        int b = sc.nextInt();
        int area = a*b;
        System.out.println("total area of rectangle is  "+ area);
        int p = 2*(a+b);
        System.out.println("total parameter of rectangle is  "+ p);
        if (area>p){
            int n = area-p;
            System.out.println("area is greater then parameter is " + n);
        }
        else {
            int m = p-area;
            System.out.println("parameter is greater then area is "+m);
        }
    }
}
