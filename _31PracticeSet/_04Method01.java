package _31PracticeSet;

public class _04Method01 {
    /*static int logic(int x, int y){*/
    int logic(int x, int y){
        int z ;
        if(x>y){
            z = x+y;
        }
        else z = (x+y)*5;

        return z;
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the Data : ");
        n = sc.nextInt();
        System.out.print(Fact(n));*/
        System.out.println("Factorial of 5 : "+ Fact(5));


        int a = 5;
        int b = 7;

        _04Method01 obj = new _04Method01();
        int c;
        c = obj.logic(a,b);
        System.out.println(c);


        int m = 9;
        int k = 9;
        System.out.println(m +","+k);
       obj.plus(m,k);
       System.out.println(m +","+k);
    }
    void plus(int a, int b){  // pass by  value // as like copy
        a = 19;
        b = 45;
    }
    private static int Fact(int n) {
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
}
