package _55ExceptionHandling;
import java.util.Scanner;
/*
Exception Class In java
Exception Class in Java
Java में Exception ek class hai. Ye java.lang package me available hoti hai, isliye ise import karne ki zarurat nahi hoti.
Object
   ↓
Throwable
   ↓
Exception
   ├── RuntimeException
   │     ├── ArithmeticException
   │     ├── NullPointerException
   │     ├── ArrayIndexOutOfBoundsException
   │     ├── NumberFormatException
   │     └── ClassCastException
   │
   ├── IOException
   ├── SQLException
   ├── InterruptedException
   └── etc.
   Exception class ka role
Exception ek parent/base class hai jiske through program me exceptional situations ko represent aur handle kiya jata hai.
ArithmeticException
       ↓
RuntimeException
       ↓
Exception
       ↓
Throwable
       ↓
Object
Object
   ↓
Throwable
   ├── Error
   │    ├── StackOverflowError
   │    └── OutOfMemoryError
   │
   └── Exception
        ├── RuntimeException
        │    ├── ArithmeticException
        │    ├── NullPointerException
        │    └── ...
        │
        ├── IOException
        ├── SQLException
        └── InterruptedException
*/
class myException extends Exception{
    @Override
    public  String toString(){
        //return  super.toString() + "I am To String()";
        return "I am To String()";
    }
    public String getMessage(){
        //return super.getMessage() + "I am GetMessage ";
        return "I am GetMessage ";
    }

}
public class _04ExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a<9){
            try {
                throw new myException();
                //throw new ArithmeticException("This Is Exception");
            }
            /*catch (myException e){
                System.out.println(e.getMessage());
            }*/
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                //System.out.println(e.printStackTrace());
                System.out.println("Finish");
                e.printStackTrace();
            }
        }
    }
}
