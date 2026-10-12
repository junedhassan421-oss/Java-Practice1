package _55ExceptionHandling;
import java.util.Scanner;
public class _02HandlingException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = 7;
        marks[1] = 60;
        marks[2] =  100;
        marks[3] = 150;
        marks[4] = 200;

        System.out.println("Enter the Arrays Idx : ");
        int idx = sc.nextInt();
        System.out.println("Enter the number you want to divided its : ");
        int num = sc.nextInt();

        /*try {
            System.out.println("The Data at Arrays idx :" + marks[idx]);
            System.out.println(marks[idx]/num);
        }
        catch (Exception e){
            System.out.println("Exception Error is  : "+ e);
        }*/

        try {
            System.out.println("The Data at Arrays idx :" + marks[idx]);
            System.out.println(marks[idx]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException Occured : "+ e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occured : "+ e);
        }
        catch (Exception e){
            System.out.println("Some Other Exception Occured : "+ e);
        }


    }
}
