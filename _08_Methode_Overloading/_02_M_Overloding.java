package _08_Methode_Overloading;

public class _02_M_Overloding {
    static void fun(){
        System.out.println("Good morning bro!");
    }
    static void fun(int a){ // a -> parameter
        System.out.println("Good morning " + a + " bro! ");
    }
    static void fun(int a, int b){
        System.out.println("Good morning " + a + " bro! ");
        System.out.println("Good morning " + b + " bro! ");
    }
    static int fun(int a, int b , int c){
        System.out.println("Good morning " + a + " bro! ");
        System.out.println("Good morning " + b + " bro! ");
        System.out.println("hii "+ c + " hello");
        a = 7;
        return a;
    } // return type not work

    public static void main(String[] args) {
        fun();
        fun(300); // 300 (data) -> arguments
        fun(5,3); // 5,3, arguments ( arg are actual)
        fun(2,3,4);
    }
}
