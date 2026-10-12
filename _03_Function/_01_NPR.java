package _03_Function;
import java.util.Scanner;
public class _01_NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the number r : ");
        int r = sc.nextInt();
        // NPR -> N!/(N-R)!

        int Nfact = 1;
        for (int i=1;i<=n;i++){
            Nfact *=i;
        }
        int NMRfact = 1;
        for (int i=1;i<=n-r;i++){
            NMRfact *=i;
        }
        int npr = Nfact/NMRfact;
        System.out.print(n + "p" + r +"="+npr );
    }
}
