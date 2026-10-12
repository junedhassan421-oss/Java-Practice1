package _59CollectionFramework;
import java.util.ArrayDeque;
import java.util.Scanner;
public class _06ArraysDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(0);
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addFirst(5);
        dq.addFirst(6);
        dq.addFirst(7);

        System.out.println(dq);
        dq.addLast(14);
        dq.addLast(15);
        dq.addLast(16);
        System.out.println(dq);
        dq.add(-1);
        System.out.println(dq);
    }
}
