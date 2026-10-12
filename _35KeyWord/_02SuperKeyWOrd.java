package _35KeyWord;
import java.util.Scanner;
class class1{
    int a;
    class1(int a){
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
class class2 extends class1{
    class2(int c){
        super(c); // super class ke us constructor ko call krna h jo ek integer arg leta ho class1 ka constructor call hoga ab
        System.out.println("Main EK Constructor HOO : ");
    }
}
public class _02SuperKeyWOrd {
    /*class class1{
        int a;

        class1(int a){
            this.a = a;
        }
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

    }
    class class2 extends class1{

        class2(int c){
            super(c); // class1 ka constructor call hoga ab
            System.out.println("Main EK Constructor HOO : ");

        }
      }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class1 ob1 = new class1(2);
        class2 ob2 = new class2(5);
        System.out.println(ob1.getA());
        System.out.println(ob2.getA());
    }
}
