package _09_Variable_Arguments;

public class _03_Practice_Q_JAVAMETHODE {
    static void multiply(int n){
        for (int i=1;i<=10;i++){
            System.out.format(" %d X %d = %d \n", n,i,n*i );
        }

    }
    public static void main(String[] args) {
        // problem -> 01;
        multiply(8);
    }
}
