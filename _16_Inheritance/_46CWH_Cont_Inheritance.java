package _16_Inheritance;
class Base1{
    Base1(){
        System.out.println("Main ek constructor hoo ! ");

    }
    Base1(int x){
        System.out.println("I am overloaded contructor : ");
    }
    public  int x ;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}
class derived1 extends Base1{
    derived1(){
        System.out.println("Main ek derived class ka constructor hoo ! ");
    }
    derived1(int x, int y){
        System.out.println("i am a verloaded contructore of derived class with values of x and y is : " + x +" "+ y);
    }
    public  int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class _46CWH_Cont_Inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        derived1 d = new derived1();
        derived1 d1 = new derived1(14,15);


    }
}
