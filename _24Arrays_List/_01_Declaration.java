package _24Arrays_List;
import java.util.ArrayList;
import java.util.Collections;

public class _01_Declaration {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.removeFirst());
        System.out.println(arr.removeLast());
        System.out.println(arr);
        System.out.println(arr.size());
        //System.out.println(arr.stream().max());
        arr.add(1,8);
        System.out.println(arr);
        //System.out.println(arr.addAll());
        System.out.println(arr.indexOf(1));
        System.out.println(arr.clone());
        //System.out.println(arr.set(0,9));
        arr.set(0,9);
        System.out.println(arr);
        int size = arr.size();
        System.out.println(size);

        for (int i=0;i<size;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
