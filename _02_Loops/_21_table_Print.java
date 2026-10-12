package _02_Loops;
import java.util.Scanner;
public class _21_table_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the table :  ");
        int n = sc.nextInt();
        int tab = 1;
        for (int i=1;i<=10;i++){
            tab = n*i;
            System.out.println(n+"x"+i+"-> "+tab);
        }

    }
}
