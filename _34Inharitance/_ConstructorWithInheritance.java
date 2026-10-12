package _34Inharitance;
import java.util.Scanner;
class Bse{
    Bse(){
        System.out.println("Me ek Constructor hoo Bse class ka");
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Bse{  // agr Deived class ka Constructor h to pahle bse classs ka contructor use hota h phir Derived class ka kiyunki derived class Bse class se imheritance h
    Derived(){
        System.out.println("I am a Constructor of Derived class ");
    }
    public int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
class Arrive extends Derived{
    Arrive(){
        System.out.println("I am a Constructor of Arrive Class : ");
    }
    public  int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
public class _ConstructorWithInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bse n = new Bse();

        Derived d = new Derived();

        Arrive c = new Arrive();



    }
}
