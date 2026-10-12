package _20_Polymorphism_In_Inheritance;
abstract class pen{
    abstract void writte();
    abstract void refill();
}
class fountanpen extends pen{
    void writte(){
        System.out.println("Writte");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changednib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Biting.....");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hello junaid....");
    }
    public void eat(){
        System.out.println("Eating.....");
    }
    public void sleep(){
        System.out.println("Sleeping......");
    }
}
public class _02_60PracticeSet {
    public static void main(String[] args) {
        //01.
        fountanpen pen = new fountanpen();
        pen.changednib();
        //02.
        Human junaid = new Human();
        junaid.eat();
        junaid.sleep();
        junaid.speak();
        junaid.jump();
        junaid.bite();

        //03.
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();

        // 04.
        BasicAnimal m2 = new Human();
        m2.eat();
        m2.sleep();

        //05.
        pen m3 = new fountanpen();
        m3.refill();
        m3.writte();
        // 06.
        fountanpen m4 = new fountanpen();
        m4.changednib();
        m4.refill();
        m4.writte();
    }
}
