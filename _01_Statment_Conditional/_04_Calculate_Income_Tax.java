package _01_Statment_Conditional;
import java.util.Scanner;
public class _04_Calculate_Income_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in Lakhs pr annum : ");
        float income = sc.nextFloat();
        float tax = 0;

        if(income<2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f * (income - 2.5f);



        }
        else if (income>5f && income<=10f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (income - 5f);

        }
        else if (income>10.0f){
            tax = tax + 0.05f * (5f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);

        }
        tax *=10000;
        System.out.println("The total tax paid by employee is : " + tax+" Rs");
    }
}
