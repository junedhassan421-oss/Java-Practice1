package _32Oops;  // oops = objects pr methodes call krta
import java.util.Scanner;
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

}

class cellphone{
    public void ringing(){
        System.out.println("Phonr id Ringong..........");
    }
    public void vibrating(){
        System.out.println("Vibrating..........");
    }
    public void CallFriends(){
        System.out.println("Calling mukkun.....");
    }
}
class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimete(){
        return 4*side;
    }
}
class Rectangle{
    int length;
    int breadth;

    public void setlength(int l){
        length = l;

    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getarea(){
        return length*breadth;
    }
    public int parameter(){
        return 2*(length+breadth);
    }
}
class tommy{
    public void hitting(){
        System.out.println("Hitting the enemy : ");
    }

    public void run(){
        System.out.println("running from the enemy : ");
    }
    public void fire(){
        System.out.println("Firing Enemey : ");
    }
    int sum1(int a, int b){
        return a+b;
    }
}
public class _04PracticeSet {
    /*int sum(int a, int b){
        return a+b;
    }*/
    static int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.>
        Employee1 juniad = new Employee1();
        juniad.setname("junaid");
        System.out.println(juniad.getName());
        juniad.salary = 2000060;
        System.out.println(juniad.getSalary());
        juniad.name = "Hassan";
        System.out.println(juniad.name);
        System.out.println(juniad.getName());
        juniad.setname("khaaaaan");
        System.out.println(juniad.getName());


        //2.>
        cellphone newcellphone = new cellphone();
        newcellphone.CallFriends();
        newcellphone.ringing();
        newcellphone.vibrating();

        // 3>

        Square a = new Square();
        a.side = 8;
        System.out.println(a.area());
        System.out.println(a.perimete());

        // 4>
        Rectangle rec = new Rectangle();
        rec.setlength(4);
        rec.setBreadth(8);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        System.out.println(rec.getarea());
        System.out.println(rec.parameter());

        tommy t = new tommy();
        t.fire();
        t.run();
        t.hitting();


        //5> repeat 4 in the circle

        System.out.println(sum(9,4));;

        //System.out.println(sum1(8,9));



    }
}
