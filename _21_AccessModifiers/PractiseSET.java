package _21_AccessModifiers;
class Calculator{
    public void calc(int a, int b){
        System.out.println("Your Result is : " + a+b);
    }
    public void Scicalc(int a, int b){
        System.out.println("Your Result is : " + Math.sin(a+b));
        System.out.println("Your Result is : " + Math.cos(a+b));
    }
    public void mycalc(int a, int b){
        System.out.println("Your Result is : " + a+b);
        System.out.println("Your Result is : " + Math.tan(a));
        System.out.println("Your Result is : " + Math.tanh(a));

    }

}
public class PractiseSET {
    public static void main(String[] args) {
        System.out.println("I am Main Method : ");
        Calculator calcu = new Calculator();
        calcu.calc(2,4);
        calcu.Scicalc(45,45);
        calcu.Scicalc(0,1);
        calcu.mycalc(45,1);
    }
}
