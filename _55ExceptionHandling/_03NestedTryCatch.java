package _55ExceptionHandling;
import java.util.Scanner;
public class _03NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        marks[0] = 7;
        marks[1] = 60;
        marks[2] =  100;
        marks[3] = 150;
        marks[4] = 200;
        boolean flag = true;
        System.out.println("Enter the Arrays Idx : ");
        int idx = sc.nextInt();
        System.out.println("Enter the number you want to divided its : ");
        int num = sc.nextInt();

        /*try {
            System.out.println("Welcome to My Channels : ");
            try {
                System.out.println(marks[idx]);
                System.out.println(marks[idx]/num);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException Occured : "+ e);
                System.out.println("Exception level2");
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException Occured : "+ e);
            }
            catch (Exception e){
                System.out.println("Some Other Exception Occured : "+ e);
            }
        }
        catch (Exception e){
            System.out.println("Sorry "+ e);
            System.out.println("Exception level1");
        }*/

        while (flag){
            try {
                System.out.println("Welcome to My Channels : ");
                try {
                    System.out.println(marks[idx]);
                    System.out.println(marks[idx]/num);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    flag = false;
                    System.out.println("ArrayIndexOutOfBoundsException Occured : "+ e);
                    System.out.println("Exception level2");
                }
                catch (ArithmeticException e){
                    flag = false;
                    System.out.println("ArithmeticException Occured : "+ e);
                }
                catch (Exception e){
                    flag = false;
                    System.out.println("Some Other Exception Occured : "+ e);
                }
            }
            catch (Exception e){
                System.out.println("Sorry "+ e);
                System.out.println("Exception level1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
