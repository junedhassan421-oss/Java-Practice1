package Switch;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();

        switch (buttom) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break;
            case 3 : System.out.println("banjoor");
            break;
            default: System.out.println("invalid bottom");
        }
    }
}