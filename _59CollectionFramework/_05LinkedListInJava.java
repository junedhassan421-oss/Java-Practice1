package _59CollectionFramework;
import java.util.LinkedList;
import java.util.Scanner;
public class _05LinkedListInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>list = new LinkedList<>();
        /*list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());*/
        System.out.println("Enter the size of List : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.addFirst(100);
        list.addLast(1200);
        System.out.println(list);

    }
}
