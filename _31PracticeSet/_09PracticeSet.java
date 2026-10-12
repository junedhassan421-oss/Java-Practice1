package _31PracticeSet;
import java.util.ArrayList;
import java.util.Scanner;
public class _09PracticeSet {
    static void fibonaciiseries(int n, ArrayList<Integer>fibo,int x, int y){
        if(n == 2) return;
        int m = x + y;
        fibo.add(m);
        fibonaciiseries(n-1,fibo,y,m);
    }
    static void fibonacciSeries(int n,int a, int b){
        if(n == 2) return;
        int c = a+b;
        System.out.print(c+" ");
        fibonacciSeries(n-1,b,c);
    }

    static int fibo(int n){
        if(n == 0 || n == 1) return n;
       // 0 1 1 2 3 5 8 13 21 34 55
        return fibo(n-1) + fibo(n-2);
    }

    static int sum(int n){
        if(n == 1) return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Table size : ");
        n = sc.nextInt();

        for (int i=1;i<10;i++){
            System.out.format("%d X %d = %d\n",n,i, n*i);
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("👋");
            }
            System.out.println();
        }
        System.out.println(sum(n));
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("😮");
            }
            System.out.println();
        }

        System.out.println(fibo(n));

        ArrayList<Integer>fibo = new ArrayList<>();
        int x = 0;
        fibo.add(x);
        int y = 1;
        fibo.add(y);

        fibonaciiseries(n,fibo,x,y);
        System.out.println(fibo);

        /*System.out.print(0);
        System.out.print(1);*/
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        fibonacciSeries(n,a,b);

    }
}
