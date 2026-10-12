package _54TypeOfError;
import java.util.Scanner;
public class _01Error {
    /* There are 3-type of Error in java */
    /* * Java Errors
   Java Program Errors

Java Program Errors
│
├── 1. Compile-Time Errors
│     │
│     ├── Syntax Error
│     ├── Type Mismatch
│     ├── Undeclared Variable
│     ├── Method Not Found
│     ├── Wrong Arguments
│     ├── Missing Return
│     └── Access violation
│
├── 2. Runtime Errors / Exceptions
│     │
│     ├── ArithmeticException
│     ├── NullPointerException
│     ├── ArrayIndexOutOfBoundsException
│     ├── StringIndexOutOfBoundsException
│     ├── NumberFormatException
│     ├── ClassCastException
│     ├── IllegalArgumentException
│     └── etc.
│
└── 3. Logical Errors
      │
      ├── Wrong formula
      ├── Wrong condition
      ├── Wrong loop
      └── Wrong algorithm
❤️ 1. Compile-Time Errors : Ye errors compile karte time detect hote hain. Program successfully compile nahi hota.
    * int a = 10
    System.out.println(a);
    * यहाँ ; missing है।  error: ';' expected
    * Example: Wrong type
    * int x = "Hello";  String को int में directly नहीं डाल सकते। Example:
    Undefined variable : System.out.println(x); अगर x declare ही नहीं किया है।/*
     Example: Method spelling : System.out.println("Hello")
     System.out.println("Hello")

     👉1.1 Syntax Error : Java ke grammar/rules galat hain.
      public static void main(String[] args) {
         int a = 10
            System.out.println(a);
       }       ; missing hai.

     Examples: missing ;, {}, (), quotes etc.

     👉1.2 Type Error / Type Mismatch : Wrong data type assign karna.
       int age = "20";  "20" is a String, but age is int.

     👉1.3 Undeclared Variable : Variable declare kiye bina use karna
       public class Main {
    public static void main(String[] args) {
        System.out.println(age);
    }
  }        age declare hi nahi hai.

    👉1.4 Method Not Found / Missing Method : Aisi method call karna jo class me available nahi hai.
           String name = "Raza"; name.xyz();

     👉1.5 Wrong Number of Arguments : Method ko jitne arguments chahiye usse different number dena.
     void add(int a, int b) {
        System.out.println(a + b);
    }  add(10);  // Method ko 2 arguments chahiye, tumne 1 diya.

    👉1.6 Missing Return Statement : Non-void method me required return nahi diya.
int add(int a, int b) {
    int c = a + b;
}   // int method ko value return karni chahiye.

   👉 1.7 Access Modifier Related Compile Error
Private member ko outside class directly access karna.



❤️2. Runtime Error / Exception : Program successfully compile हो जाता है, लेकिन run करते समय problem आती है।
     int a = 10;
     int b = 0;
        System.out.println(a / b) : Compile हो जाएगा, लेकिन run करते समय:
        Ex : ArithmeticException
     क्योंकि integer को zero से divide नहीं कर सकते।
     Common Runtime Exceptions
         👉2.1.> ArithmeticException;
         int x = 10 / 0;

        👉 2.2.> NullPointerException : String s = null;
             System.out.println(s.length());
            String s = null;
            System.out.println(s.length());

         👉 2.3.> ArrayIndexOutOfBoundsException :
           int arr[] = {10,20,30};
           System.out.println(arr[5]);

           int arr[] = {10,20,30};
           System.out.println(arr[5]);

         👉 2.4>. NumberFormatException : int x = Integer.parseInt("abc");
               ClassCastException
               गलत type casting करने पर।

               Ex :  NumberFormatException : Invalid String ko number me convert karna.
        String s = "abc";
        int x = Integer.parseInt(s);

        String s = "abc";
        int x = Integer.parseInt(s); "abc" integer nahi hai.
        NumberFormatException


         👉2.5 StringIndexOutOfBoundsException : String ki valid index ke bahar character access karna.
         String name = "Java";
         J  a  v  a
         0  1  2  3   // System.out.println(name.charAt(5));

        👉2.6 ClassCastException : Wrong type casting.
            Object obj = "Hello";
            Integer x = (Integer) obj;
            Object ke andar actually String hai, Integer nahi.
            ClassCastException


       👉 2.7 IllegalArgumentException :  Method ko invalid argument dena. // Thread.sleep(-100); Negative sleep time invalid hai, so IllegalArgumentException aa sakta hai.
        👉 2.8 ConcurrentModificationException: Collection ko iterate karte waqt improperly modify karna.
                     ArrayList<Integer> list = new ArrayList<>();
                           list.add(10);
                           list.add(20);

                    for(Integer x : list) {
                       list.remove(x);
                    }  // ConcurrentModificationException


       👉 2.9 StackOverflowError : Ye technically Exception nahi, Error hai.
       static void fun() {
           fun();
       }
fun()
 ↓
fun()
 ↓
fun()
 ↓
...

     
3.Logical Error : Program compile भी होता है और run भी होता है, लेकिन answer गलत देता है.
✅ Compile hota hai
✅ Run hota hai
❌ Lekin answer/output wrong hota hai.
      Example:
                           int a = 10;
                           int b = 20;
                           int average = a + b / 2;
                           System.out.println(average);  Tum expect kar rahe ho: 15 Lekin operator precedence ke according:
                            10 + (20/2) = 20
                            Program crash नहीं करेगा, लेकिन logic गलत है। int average = (a + b) / 2;


            ❤️❤️ Error vs Exception
                    Ye interview me important hai.
                    Java me Throwable hierarchy roughly:

              👉Error : Generally serious JVM/system-level problems.
              Examples:  OutOfMemoryError
                         StackOverflowError
                   static void fun() {
                              fun();
                      }
                      Infinite recursion eventually: StackOverflowError


              👉 Exception : Program execution ke dauran handle ki ja sakne wali exceptional situations.
                             Examples:
                                 ArithmeticException
                                 NullPointerException
                                 IOException
                                 InterruptedException
                         Exception ke 2 important types Exception
   │
   ├── Checked Exception : Checked Exception
                  Compiler force karta hai ki tum exception ko handle karo ya declare karo.
                  Example: Thread.sleep(1000); InterruptedException
                        try {
                             Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            System.out.println("Interrupted");
                           }
                         or
                         void test() throws InterruptedException {
                                          Thread.sleep(1000);
                        }
   │
   └── Unchecked Exception : Ye generally RuntimeException ke under aati hain.
                 RuntimeException
      |
      ├── ArithmeticException
      ├── NullPointerException
      ├── ArrayIndexOutOfBoundsException
      └── NumberFormatException

      | Type                   | Kab pata chalta hai?       | Example                 |
| ---------------------- | -------------------------- | ----------------------- |
| **Compile-Time Error** | Compile time               | Missing `;`, wrong type |
| **Runtime Exception**  | Program run hone par       | `10/0`, null access     |
| **Logical Error**      | Output check karne par     | Wrong formula           |
| **Error**              | Serious JVM/system problem | `OutOfMemoryError`      |


🧠 Interview shortcut
Compile → Runtime → Logic
     Code compile nahi hua
       ↓
Compile-Time Error

Compile ho gaya
       ↓
Run karte waqt crash/exception
       ↓
Runtime Error/Exception

Run bhi ho gaya
       ↓
Answer galat
       ↓
Logical Error

👉सबसे आसान याद रखने का तरीका:
Compile → Run → Result

Compile नहीं हुआ
     ↓
Compile-Time Error

Compile हुआ लेकिन Run करते समय problem
     ↓
Runtime Error / Exception

Run भी हुआ लेकिन Answer गलत
     ↓
Logical Error

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();


    }
}
