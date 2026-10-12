package _04_Arrays;

public class _10_Passing_Arrays_Fun {
    /*public static void fun(int a){
        a = 7;
        return;
    }*/

    /*public static int fun(int n){
        n = 10;
        return n;
    }*/

    public static void fun(int b[]){
        b[0] = 15;
        return;
    }

    public static void main(String[] args) {
        /*int a = 4;
        System.out.println(a);
        fun(a);
        System.out.println(a);*/ // not changing

        /*int a = 8;
        System.out.println(a);
        System.out.println(fun(a));*/

        int a[] = {1,2,3,4,5};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        fun(a);
        System.out.println();
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");   // change // Pass by refrence
        }


    }
}
