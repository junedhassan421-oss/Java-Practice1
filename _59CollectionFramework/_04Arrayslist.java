package _59CollectionFramework;
import java.util.ArrayList;
import java.util.Scanner;
/*
ArrayList in Java ⭐⭐ : ArrayList is a resizable array implementation of the List interface in Java. It is used to store multiple elements and its size can grow or shrink dynamically.
ArrayList Java mein ek dynamic array hai jo multiple elements ko store karta hai. Iska size zarurat ke according automatically increase ya decrease ho sakta hai.
* */
public class _04Arrayslist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(15);
        l1.add(20);
        l1.add(35);
        l1.add(40);
        l1.add(0,60);

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println();
        System.out.print(l1);


        ArrayList<Integer>l2 = new ArrayList<>();

        //l1.addAll(12,13,14,15,16,20,45,);
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l1.addAll(l2);

        System.out.println(l1);


        ArrayList<ArrayList<Integer>> l3 = new ArrayList<>();
        l3.add(l1);
        l3.add(l2);

        for(int i=0;i<l3.size();i++){
            for(int j=0;j<l3.get(i).size();j++){
                System.out.print(l3.get(i).get(j)+" ");
            }
        }

        System.out.println();
        System.out.println(l1.indexOf(3));
        System.out.println(l1.indexOf(15));
        System.out.println(l1.lastIndexOf(12));

        System.out.println();
        System.out.print(l3);
        l1.clear();
        System.out.println();
        System.out.println(l3);

        System.out.println(l3.contains(300)); // l3.get(0).contains(300)
        System.out.println(l3.get(1).contains(300));
        System.out.println(l3.get(1).indexOf(1));
        System.out.println(l3.get(1).indexOf(300));

        System.out.println(l3.get(1).lastIndexOf(300));
        System.out.println(l3.get(1).lastIndexOf(200));
    }
}

