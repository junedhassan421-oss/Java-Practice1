package _35KeyWord;
import java.util.Scanner;
class ExClass{
    int a ;
    ExClass(int /*va*/a){
        //a = va;
       // this.a = va;  // yha se a ke value ko pass krne ke liye bhi this keyword ka use hota h
        this.a = a;
        //a = a;
    }

    public int getA() {
        return a;
    }

    public int returnnon(){
        return 1;
    }

}
public class _01ThisKeyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExClass b = new ExClass(5);
        System.out.println(b.getA());

    }
}
