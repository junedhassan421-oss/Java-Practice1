package _49ThreadLifeCycle;
import java.util.Scanner;
public class _01Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Nahi. Thread class ke andar almost sabhi data types ke variables nahi hote. Ye ek common misunderstanding hai.
        class MyThread extends Thread {
        }
        iska matlab hai:
        MyThread ko Thread class ke members (fields + methods) inherit/access karne ka relationship mil gaya.

        Thread class kya contain karti hai
        Conceptually usme thread ko manage karne se related fields/methods hote hain, jaise:
        Thread
 ├── name
 ├── priority
 ├── id
 ├── state
 ├── daemon status
 └── methods
      ├── start()
      ├── run()
      ├── sleep()
      ├── join()
      ├── interrupt()
      ├── getName()
      ├── setName()
      ├── getPriority()
      └── setPriority()
      Ye different data types use kar sakte hain:
       int       → priority
       long      → id
       String    → name
       boolean   → daemon status
       enum      → state

       Lekin iska matlab ye nahi ki:
       Thread class
       ↓
        int, float, double, char, String,
        array, etc. sab data types rakhti hai

        Thread class ka purpose thread ko represent aur control karna hai, na ki Java ke sab data types store karna.
        * */

    }
}
