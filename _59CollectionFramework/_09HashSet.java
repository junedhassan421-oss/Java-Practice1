package _59CollectionFramework;
import java.util.HashSet;
import java.util.Scanner;
public class _09HashSet {
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Set : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the Next Value of Set : ");
            set.add(sc.nextInt());
        }
        System.out.println(set);
        for (int i=0;i<n;i++){
            System.out.println(set.add(78));
        }


    }
}
