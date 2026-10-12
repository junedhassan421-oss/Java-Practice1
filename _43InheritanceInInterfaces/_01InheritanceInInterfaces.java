package _43InheritanceInInterfaces;
import java.util.Scanner;
interface Simple{
    void meth1();
    void meth2();

}
/*class Combine extends Simple{
    not Allowed extends in claas allowed Implement
}*/
interface  childSimple extends Simple{
    void meth3();
    void meth4();

}
class Combined implements childSimple{
    public void meth3(){
        System.out.println("Method03");
    }
    public void meth4(){
        System.out.println("Method04");
    }
    public void meth1(){
        System.out.println("Method01");
    }
    public void meth2(){
        System.out.println("Methodes04");
    }
    public void myFunc(){
        System.out.println("Hellow Everyone : ");
    }
}
public class _01InheritanceInInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Combined obj = new Combined();
        obj.meth4();

    }
}
