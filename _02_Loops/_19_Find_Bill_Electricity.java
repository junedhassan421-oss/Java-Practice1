package _02_Loops;
import java.util.Scanner;
public class _19_Find_Bill_Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Energy -> Power*Time
        //    Kwh -> Power/100*Time
        System.out.print("Enter your total Electric Watt : ");
        float p  = sc.nextFloat();
        float kw = p/1000;
        System.out.print("Enter your total time : ");
        float t = sc.nextFloat();
        float kwh = kw*t;
        System.out.print("Enter your Electricity Cost per unit : ");
        float unitCost = sc.nextFloat();
        float bill = kwh*unitCost;
        System.out.print("Your total Electricity Bill is : "+bill);

    }
}
