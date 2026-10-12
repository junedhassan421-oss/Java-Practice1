package _64GenerateOurOwnJavaDocsForOurPackage;
import java.util.Scanner;
// Anonymous Class :- main fun se sirf interface class ke reference se  object bna kr use krke ek Anonymous class bnaya ja sakta h
// Lambda Expression :-

//FunctionalInterface
interface demoAnno{
    /*public static void math1(){
        System.out.println("Mai hu Interface method");
    }*/
    void math1(int a);
    void math2();
}
// Junaid Class Implements interface class demoAnno
/*class Junaid implements demoAnno{
    @Override
    public void math1(){
        System.out.println("Junaid mathe1");
    }
    public void math2(){
        System.out.println("Junaid mathe2");
    }
}*/
// class Anonymous implements demoAnno
/*class Anonymous implements demoAnno{
    public void display(){
        System.out.println("Display");
    }
    @Override
    public void math1(){
        System.out.println("Mathe1");
    }
    @Override
    public void math2(){

    }
}*/

class _04JavaAnonymousClassAndLambda {
    // Class ke ander ke class ko main fun se direct use krna chahte ho to class ko static krna important ho jayega
    /*public interface demoAnno{
        void math1();
        void math2();
    }
    static class Anonymous implements demoAnno{
        public void display(){
            System.out.println("Display");
        }
        @Override
        public void math1(){
             System.out.println("Math1");
        }
        @Override
        public void math2(){
            System.out.println("Math2");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //_04JavaAnonymousClassAndLambda obj = new _04JavaAnonymousClassAndLambda();
        /*Anonymous Ad = new Anonymous();*/

        // Anonymous Objects  // create Anonymous class by Objects
        /*Anonymous Ad = new Anonymous();
        Ad.display();
        Ad.math1();
        Ad.math2();*/

        // AnonyMous Class Without ANy Support
        /*demoAnno onj1 = new demoAnno() {
            public static void math3(){  // does not Access
                System.out.println("Math3");
            }
            @Override
            public void math1() {
                System.out.println("Math1");
            }
            @Override
            public void math2() {
                System.out.println("Math2");
            }
        };
        onj1.math1();
        onj1.math2();*/


        // Lambda Expression Class With Junaid Class
        /*demoAnno obj1 = new Junaid();
        obj1.math1();
        obj1.math2();*/


        // Lambda Expression
        /*demoAnno obj2 = (a)-> {
           System.out.println("I am Method One From Expression Lambda + a");
        };
        obj2.math1(6);
        obj2.math2();*/

    }
}
