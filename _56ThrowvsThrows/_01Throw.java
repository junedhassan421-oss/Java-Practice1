package _56ThrowvsThrows;
import java.util.Scanner;
class NegativeException extends Exception{
    public String toString(){
        return "Radius Can not be Negative";
    }
    public String getMessage(){
        return "Radius Can not be Negative";
    }
}
public class _01Throw {
    // Throws : methode declare krta h ki exception aa sakti h ya nhi
    //2.>  throws : throws is used in a method declaration to specify that the method may throw one or more exceptions.
    //throws ka use method declaration me ye declare karne ke liye hota hai ki method se ek ya more exceptions aa sakti hain.
    public static double area(int r)throws NegativeException{
        if(r>0){
            throw new  NegativeException();
        }
        double res = Math.PI*r*r;
        return res;
    }

    // Throw Keyword :- It is a throw of Actual Exception throw
    // Throw :- Throw keyword is used to throw an exception especially by the programmer
    //1.>  throw : throw is used to explicitly throw an exception from a method or block of code.
    // throw ka use kisi exception ko manually/explicitly throw karne ke liye kiya jata hai.
    public static int divite(int a, int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args) throws NegativeException {
        Scanner sc = new Scanner(System.in);
        try {
            int c = divite(6,0);
            System.out.println(c);

        }catch (ArithmeticException e){
            System.out.println("Exception");
            System.out.println(e);
        }


        try {
            double are = area(12);
            System.out.println(are);
        } catch (ArithmeticException e){
            System.out.println("Exception");
        }


    }
}
