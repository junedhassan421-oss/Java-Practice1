package _31PracticeSet;
import java.util.Scanner;
public class _06VariableArguments {
    /*static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){  // Overloading sum function
        return a+b+c;
    }
    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }*/
    static int sum(int ...arr){
        int arr1[] = arr;
        int sum1 = 0;
        for(int a : arr1){
            sum1 += a;
        }
        return sum1;
    }
    static int sum1(int var, int ...arr){  // is function ko ek arguments kam se kam chahiye hi chahiye
       //int result = var+arr; // error
        int result = var; //
        for(int a : arr){
            result += a;
        }
       return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Sum 4 and 5 is : " + sum(4,5));
        System.out.println("The Sum 4 and 5 ans  6 is : " + sum(4,5,6));
        System.out.println("The Sum 4 and 5 ans  6 ans 8 is : " + sum(4,5,6,8));
        System.out.println("The Sum 4 and 5 ans  6 ans 8 and 10 is : " + sum(4,5,6,8,10));
        System.out.println("The Sum Nothing is : " + sum());
        //System.out.println("The Sum Nothing is : " + sum1());  // error // is function ko ek arguments kam se kam chahiye hi chahiye
        System.out.println("The Sum At Least is : " + sum1(8));
        System.out.println("The Sum At Least Another  is : " + sum1(8,10));
    }
}
