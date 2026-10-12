package Switch;
import java.util.Scanner;
public class switchcondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottom;
        bottom = sc.nextInt();

        if(bottom == 1) {
            System.out.println("hello");
        } else if(bottom == 2) {
            System.out.println("namaste");
        } else if(bottom == 3){
            System.out.println("banjoor");
        } else{
            System.out.println("invalid bottom");
        }
    }
}
