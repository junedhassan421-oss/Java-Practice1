package _33AcessModifier;
import java.util.Scanner;
public class _01AccessModifier {
    static class myEmployee{
         private int id;
         private String name;


        public  String getname(){
            return name;
        }
        public void setname(String n){
//            name = n;        // or
            this.name = n;
        }
        public void setid(int i){
//            id = i;         // or
            this.id = i;
        }
        public  int getid(){
            return id;
        }
    }
    public static void main(String[] args) {
           myEmployee juned = new myEmployee();
           //juned.id = 11;
           //juned.name = "hassan"; // throws an error due to private access modifiers
        //System.out.println(juned.getname());


        juned.setname("HAssan");
        System.out.println(juned.getname());

        juned.setname("khannna");
        System.out.println(juned.getname());

        juned.setid(20230009);
        System.out.println(juned.getid());


        /// not -> most methodes of Access modifiers then google search oracleducks Access modifiers




    }
}
