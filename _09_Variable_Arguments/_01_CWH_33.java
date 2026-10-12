package _09_Variable_Arguments;
public class _01_CWH_33 {

    /*public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/

    public static int sum(int ...arr){  // Varargs Methode
        // Available as int [] arr;
        int res = 0;
        for (int a:arr){
            res += a;
        }
        return res;
    }
    /*public static int sum(int x, int ...arr){  // Varargs Methode
        // Available as int [] arr;
        int res = x;
        for (int a:arr){
            res += a;
        }
        return res;
    }*/
    public static void main(String[] args) {
        System.out.println("Welcome to Argument Methode : ");
        System.out.println("the sum of Nothing is : "+sum());
        System.out.println("the sum of one is : "+ sum(1));
        System.out.println("The sum of 4 and 5 is : "+ sum(4,5));
        System.out.println("The sum of 4 and 6 and 8 is : "+sum(4,6,8));
        System.out.println("the sum of 15 and 25 and 10 is : "+sum(15,25,10,20,50));
        //System.out.println("the sum of 15 and 25 and 10 is : "+sum(x 2, ...arr 15,25,10,20));
    }
}
