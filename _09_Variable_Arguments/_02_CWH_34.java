package _09_Variable_Arguments;

public class _02_CWH_34 {
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
           return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        System.out.print(factorial(5));
    }
}
