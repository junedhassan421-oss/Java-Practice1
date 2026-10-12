package _01_Statment_Conditional;
import java.util.Scanner;
public class _02_Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter your selling price : ");
        int sp = sc.nextInt();
        if (sp>cp){
            System.out.print(sp-cp+" rs is profit");
        }
        else if (cp>sp){
            System.out.print(cp-sp+"  rs is lose ");
        }
        if (sp==cp){
            System.out.print("No profit no lose");
        }

    }
}
