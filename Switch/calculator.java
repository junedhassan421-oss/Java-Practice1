package Switch;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int operator, n1 , n2;  // user se input 3 variable liya hu
        System.out.println("1 - add \n 2 - subtract \n 3 - multyply \n 4 - divide");
        System.out.print("choose operator : ");
        Scanner sc = new Scanner(System.in);
//        operator = sc.next().charAt(0);
        operator = sc.nextInt();
        System.out.print("enter the 1st number : ");
        n1 = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        n2 = sc.nextInt();

        int result = 0;
        switch (operator) {  // switch if else condition ke trah hi kaam karta h
            case 1 : result = n1 + n2;
            break;
            case 2 : result = n1 - n2;
            break;
            case 3 : result = n1 * n2;
            break;
            case 4 : result = n1/n2;

            default: System.out.println("enter operator is not valid");

        }
        System.out.println("result is :" +result);

    }
}

