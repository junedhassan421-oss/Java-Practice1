package _31PracticeSet;
import java.math.BigInteger;
import java.util.Scanner;
public class _08FactorialBigNumber {
    /*ध्यान दें
    int लगभग 12! तक सुरक्षित रहता है।
    long लगभग 20! तक सुरक्षित रहता है।
    21! से आगे long भी overflow हो जाता है। बड़े factorial के लिए BigInteger का उपयोग करना चाहिए।*/

    /*public static long Factorial(long n){
        if(n == 1 || n == 0) return 1;
        return  n*Factorial(n-1);
    }*/
    public static BigInteger Factorial(BigInteger n){

        if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }
        return  n.multiply(Factorial(n.subtract(BigInteger.ONE)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n;
        System.out.println("Enter the Number : ");
        n = sc.nextBigInteger();

        System.out.println(Factorial(n));


    }
}
