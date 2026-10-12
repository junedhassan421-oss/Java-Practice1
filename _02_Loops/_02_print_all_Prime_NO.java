package _02_Loops;
import java.util.Scanner;
public class _02_print_all_Prime_NO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the started number : ");
        int low = sc.nextInt();
        System.out.print("Enter the ended number : ");
        int high = sc.nextInt();

        for (int n =low;n<=high;n++){
            int count =  0;
            for (int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(n+" ");
            }
        }


    }
}
