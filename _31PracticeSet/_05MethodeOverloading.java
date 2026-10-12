package _31PracticeSet;
import java.util.Scanner;
public class _05MethodeOverloading {
    static void changed1(int x){  // pass by value
        x = 100;
    }
    static void changed2(int arr[]){  // pass by reference
        arr[1] = 110;
    }
//     void teljoke(){
    static void teljoke(){
        System.out.println("I Invented a new word ! : " + "plagiarism ! ");
    }
   /* static void jok(){
        teljoke();
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // jok();
        teljoke();

        int amrks[] = {12,543,7,78,98,99};

        int x = 90;
        System.out.println(x);
        changed1(x);
        System.out.println(x);

        System.out.println(amrks[1]);
        changed2(amrks);
        System.out.println(amrks[1]);


        // Method Overloading
        foo();
        foo(900); // one arguments  // arguments are actual
        //foo(5);
        foo(500,100);  // Two Arguments

        //System.out.println(foo(3,6));  // return  type same and same data type arguments not overloading
        //System.out.println(foo(6));

        System.out.println(foo(6,8,9));

        System.out.println(foo("junaid","hassan"));




    }
    static void foo(){
        System.out.println("Good Morning Everyone ! ");
    }
    static void foo(int a){  // one parameter
        System.out.println("Good Morning Everyone ! "+ a + "bro! ");
    }
    /* void foo(int b) {  // one parameter
        System.out.println("Good Morning Everyone ! " + a + "bro! ");
    }*/
    static void foo(int a, int b){ // Two Parameter
        System.out.println("Good Morning Everyone ! "+ a +"And" + b +  "bro! ");
    }
    /*static int foo(int a, int b){ // Two Parameter
        System.out.println("Good Morning Everyone ! "+ a +"And" + b +  "bro! ");
        return a+b;
    }*/

    /*static int foo(String a){ // one Parameter
        System.out.println("Good Morning Everyone ! "+ a +"And" + b +  "bro! ");
        return a+9;
    }*/

    static String foo(String a, String b){ // Two Parameter
        System.out.println("Good Morning Everyone ! "+ a +"And" + b +  "bro! ");
        return a+b;
    }

    static int foo(int a, int b,int c){
        return a+b+c;
    }
}
