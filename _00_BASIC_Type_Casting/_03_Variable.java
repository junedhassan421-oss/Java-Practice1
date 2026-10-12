package _00_BASIC_Type_Casting;
import java.util.Scanner;
public class _03_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integer number : ");
        /*int n = sc.nextInt();*/
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("name : ");
        String st = sc.nextLine();
        System.out.println("Deare "+ st + " Here is the counting");
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
}
