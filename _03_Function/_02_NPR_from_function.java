package _03_Function;
import java.util.Scanner;
public class _02_NPR_from_function {
    public static int fact(int x){
        int rv = 1;
        for (int i=1;i<=x;i++){
            rv *=i;
        }
        return rv;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the number r : ");
        int r = sc.nextInt();
        // NPR -> N!/(N-R)!

        int Nfact = fact(n);
        int nmrfact = fact(n-r);

        int npr = Nfact/nmrfact;
        System.out.print(n +"p"+r+" -> "+npr);
    }
}
