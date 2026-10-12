package _32Oops;
import java.util.Scanner;

class Employeee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public  int getid(){
        return id;
    }
    public void setid(int num){
        id = num;
    }
    public void setname(String n){
        //this.name = n;
        name = n;
    }
}
public class _5AccessModifiers {
    /*Access modifier : Special when a properties / method is Accessible there are four type of Access modifier in java*/
    //1.> private
    //2.> Default
    //3.> Protected
    //4.> public
    /*static class Employyyee{
        private int id;
        private String name;

        public static int getnam(){
            return name;
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Employyyee juned = new Employyyee();
        juned.id = 786;
        juned.name = "Junaidkhaaan";
        System.out.println(juned.name);
        System.out.println(juned.getname());*/

        Employeee juned = new Employeee();

        /*juned.id = 786;
        juned.name = "hassan";*/ // throw in error due to private access modifier

        juned.setname("junaid");
        juned.setid(867);

        System.out.println(juned.getname());
        System.out.println(juned.getid());


    }
}
