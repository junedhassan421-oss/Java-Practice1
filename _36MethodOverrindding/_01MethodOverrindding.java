package _36MethodOverrindding;
import java.util.Scanner;
class A{
    public int a ;
    public  int Junaid(){
        return 5;
    }
    public  void meth2(){
        System.out.println("I am Method2 Of Class A");
    }
}
class B extends A{
    /*public  void meth2(int a){
        System.out.println("I am Method2 Of Class B");
    }*/
   /* @Override
      public  void meth21(){
         System.out.println("I am Method2 Of Class B");
     }*/
     /*@Override  // without likhe bhi kaam hosakta h
     public  void meth2(){
         System.out.println("I am Method2 Of Class B");
     }*/

//    @Override  // Overrinde anotation  // override ho raha h to notation laga bhi sakte ho or nhi bhi kroge to override hoga lekin agr methode override nhi ho raha tb lagoge to issue ayega
    public  void meth2(){
        System.out.println("I am Method2 Of Class B");
    }
    /*private   void meth2(){
        System.out.println("I am Method2 Of Class B");
    }*/  // agr upper public method h to override me private nhi kr sakte
    public void meth3(){
        System.out.println("I am Meth3 Of Class B : ");
    }
}
public class _01MethodOverrindding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A ob = new A();
        ob.meth2();

        B ob1 = new B();
        ob1.meth2();

        ob1.meth3();
    }
}
