package _32Oops;
import java.util.Scanner;
class MyMainEmployee{
    private  int id;
    private  String name;

    public MyMainEmployee(String name , int id){
        this.name = name;
        this.id = id;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getname(){ return name;}
    public void setname(String n){this.name = n;}
    public void setid(int id){this.id = id;}
    public int getid(){return id;}

}
public class _07Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*MyMainEmployee obj1 = new  MyMainEmployee();
        obj1.setname("junaid");
        obj1.setid(865);
        String str = obj1.getname();
        System.out.println(str);
        obj1.getid();*/

        MyMainEmployee obj2 = new MyMainEmployee("Junaid",786);
        System.out.println(obj2.getname());
        obj2.setname("hassan");
        System.out.println(obj2.getname());
        MyMainEmployee obj1 = new MyMainEmployee("kalamSir");
        obj2.setname("ShahAlam");
        System.out.println(obj2.getname());
        System.out.println(obj2.getid());
        System.out.println(obj1.getname());
        System.out.println(obj1.getid());

    }
}
