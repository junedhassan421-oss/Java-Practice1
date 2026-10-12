package _18_Methode;
abstract class parent2{
    public  parent2(){
        System.out.println("Main base2 ka contructor hoon");
    }
    public  void  superllo(){
        System.out.println("hellow");
    }
    abstract  public  void  greet();
    abstract  public  void  greet2();

}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }

 }
 /*class child3 extends parent2{
    public void th(){
        System.out.println("I am good");
    }
 }*/
 class child3 extends child2{
     public void th(){
         System.out.println("I am good");
     }
 }
public class _53CWH_AbstractMethode {
    public static void main(String[] args) {
         child2 c = new child2();
         //parent2 p = new parent2():
        c.superllo();
    }

}
