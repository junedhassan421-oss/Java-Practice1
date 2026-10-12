package _02_Loops;
import java.util.Scanner;
public class _20_Electric_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your total unit : ");
        double unit = sc.nextInt();
        double Cost = 0;

        if (unit<=50){
            Cost = Cost + 2.5f*unit;
        }
        else if (unit>50 && unit<=100){
            Cost = Cost + 2.5f*50;
            Cost = Cost + 4.5f*(unit-50);


        }
        else if(unit>100 && unit<=250){
            Cost = Cost + 2.5f*50;
            Cost = Cost + 4.5f*(100-50);
            Cost = Cost + 6.7f*(unit-100);
        }
        else {
            Cost = Cost + 2.5f*50;
            Cost = Cost + 4.5f*(100-50);
            Cost = Cost + 6.7f*(250-100);
            Cost = Cost + 8.0f*(unit-250);
        }
        System.out.print("The total cost of electric bil is : "+Cost);

    }
}
