//package Switch;
//import java.util.Scanner;
//public class CLC {
//    public static void main(String[] args) {
//        char operator;
//        double num1, num2;
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the operator (+, -, *, / )");
//        operator = input.next().charAt(0);
//
//        System.out.println("enter the two number one by one ");
//        num1 = input.nextDouble();
//        num2 = input.nextDouble();
//
//        input.close();
//
//        switch (operator) {
//            case '+':
//                System.out.println("%.2f + %.2f = %.2f ",num1,num2,(num1 + num2 ));
//                break;
//            case '-':
//                System.out.println("%.2f - %.2f = %.2f ",num1,num2,(num1 - num2 ));
//                break;
//            case '*':
//                System.out.println("%.2f * %.2f = %.2f ",num1,num2,(num1 * num2 ));
//                break;
//            case '/':
//                if(num2!=0){
//                    System.out.println("%.2f/ %.2f = %.2f ",num1,num2,(num1 / num2 ));
//
//
//                }
//                else{
//                    System.out.println("divide by zeroes situation");
//                    break;
//                }
//            default:
//                System.out.println("%c is not a valid operation",operator);
//        }
//    }
//}
