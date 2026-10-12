package _32Oops;
import java.util.Scanner;
/*public class Employee{  // AcessModifier
}*/
class Employee{
   // private int id;
    int id;
    String name;

    public void myInfo(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

}
public class _03CustomClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee pi = new Employee();  //Instantiating a nea Employee Objects
        pi.id = 786;
        pi.name = "Junaid";
        System.out.println(pi.id);
        System.out.println(pi.name);

        pi.myInfo();

    }
}
