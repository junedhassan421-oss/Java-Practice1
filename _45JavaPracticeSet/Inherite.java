package _45JavaPracticeSet;
import java.util.Scanner;
class monkey{
    void jump(){
        System.out.println("Monkey is Jumping>>>>>>>>>>>");
    }
    void bite(){
        System.out.println("Biting>>>>>>>>>>>");
    }
}
interface basicanimal{
    void eat();
    void sleep();
}
class Human extends monkey implements basicanimal{
    void speak(){
        System.out.println("Hello Sir>>>>>>>>>>>");
    }
    @Override
    public void eat(){
        System.out.println("EATING>>>>>>>>>>>>");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping>>>>>>>>>>>>>>>>>");
    }
}
public class Inherite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human obj = new Human();
        obj.eat();
        obj.speak();
        obj.jump();


        monkey obj1 = new Human();  // polymorphism

        //obj1.speak(); // not allowed
        obj1.jump();
        obj1.bite();

        basicanimal obj2 = new Human();
        obj2.sleep();
        obj1.bite();



    }
}
