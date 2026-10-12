package _14_Oops;
import java.util.Scanner;
class  Rect{
        int L,B;
        public int area(){
            return L*B;
        }
        public int perimeter(){
            return 2*(L+B);
        }

    }
public class CWH39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Eter the length of rectangle : ");
        int L = sc.nextInt();
        System.out.println("Enter the Breadth of rectangle : ");
        int B = sc.nextInt();*/

        Rect rec = new Rect();
        System.out.println("Eter the length of rectangle : ");
        rec.L = sc.nextInt();
        System.out.println("Enter the Breadth of rectangle : ");
        rec.B = sc.nextInt();

        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}
