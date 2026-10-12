package _07_Methode_Function;

public class _02_Calling_Methode {
    /*static*/  int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x + y) *5;
        }
        x = 500;
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        /*c = logic(a,b);*/
        _02_Calling_Methode ob = new _02_Calling_Methode(); // object create
        c = ob.logic(a,b);
        /*System.out.println(a+" "+b);*/

        int a1 = 15;
        int b1 = 7;
        int c1;
        /*c1 = logic(a1,b1);*/
        _02_Calling_Methode ob1 = new _02_Calling_Methode();
        c1 = ob.logic(a1,b1);

        System.out.println(c1);
        System.out.println(c);
    }
}
