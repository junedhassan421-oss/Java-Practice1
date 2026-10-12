package _16_Inheritance;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now : ");
        this.x = x;
    }

    public void  printme(){
        System.out.println("i am a constructors");

    }
}
class Derived extends base{
    int y;
    public int gety() {
        return y;
    }

    public void sety(int y) {
        System.out.println("I am in base and setting y now : ");
        this.y = y;
    }

    public void  printme(){
        System.out.println("i am a constructors");

    }
}
public class _45CWH_Introduction {
    public static void main(String[] args) {
        base b = new base();
        b.setX(45);
        System.out.println(b.getX());

        Derived a = new Derived();
        a.setX(4);
        System.out.println(a.getX());
        a.sety(55);
        System.out.println(a.gety());

    }
}
