package _62ExceptionProblem;
import java.util.Scanner;
import java.util.spi.CalendarNameProvider;
class maxInputEx extends Exception{
    public String toString(){
        return "MaxvalueInputeException";
    }
}
class InvalideInputException extends Exception{
    public String toString(){
        return "Return Can not this Inpute Invalide";
    }
    public String getmessage(){
        return "I am GetSMS";
    }
}
class CannotdivitebyZeroesException extends Exception{
    public String toString(){
        return "Can not DIvide by Zeroes : ";
    }
}
class customClc {
    double add(double a, double b) throws InvalideInputException,maxInputEx{
        if(a>100000 || b>10000000){
            throw new maxInputEx();
        }
        if(a == 6 || b == 15){
            throw new InvalideInputException();
        }
        return a + b;
    }
    double Substract(double a, double b) throws maxInputEx{
        if(a>100000 || b>10000000){
            throw new maxInputEx();
        }
        return a - b;
    }
   /* double multiplication(double a, double b) throws CannotdivitebyZeroesException{
        if(b == 0){
            throw new  CannotdivitebyZeroesException();
        }
        return a * b;
    }*/
    double division(double a, double b) throws CannotdivitebyZeroesException,maxInputEx{
        if(a>100000 || b>10000000){
            throw new maxInputEx();
        }
        if(b == 0){
            throw new  CannotdivitebyZeroesException();
        }
        return a / b;
    }
    double module(double a, double b){
        return a%b;
    }
}
public class _01Problem {
    public static void main(String[] args) throws InvalideInputException,CannotdivitebyZeroesException,maxInputEx{
        Scanner sc = new Scanner(System.in);
        customClc c = new customClc();
       // c.add(6,15);

       /* try {
            c.division(6,0);
        } catch (CannotdivitebyZeroesException e) {
            throw new RuntimeException(e);
        }*/

        c.division(6,0);

    }
}
