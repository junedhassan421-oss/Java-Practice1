package _02_Loops;
import java.util.Scanner;
public class _01_WAP_Cal_Prime_Nu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of num : ");
        int n = sc.nextInt();
        System.out.print("Enter the Integer number : ");
        // prime no -> 2,3,5,7,11,13,17,19 ....
        for (int i=0;i<n;i++){
            int m = sc.nextInt();

            int count = 0;
            if(m==1){
                System.out.println("not prime");
            }
            else for (int div=2;div*div<=m;div++){
                     if (m%div==0){
                        count++;
                        break;
                    }
            }
            if (count == 0){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }

        }
    }
}
