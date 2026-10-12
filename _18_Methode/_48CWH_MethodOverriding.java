package _18_Methode;
class A{
    public int a;
    public int junaid(){
        return 4;
    }
    /*public void meth2(int a){ // not Overriding
        System.out.println("I am methode 2 of class A ");
    }*/
    public void meth2(){
        System.out.println("I am methode 2 of class A ");
    }
}
/*class b extends A{
    public void meth3(){
        System.out.println("I am methode 3 of class b ");
    }
}*/
class b extends A{
    @Override
    /*private void meth2(){  // not Overriding
        System.out.println("I am methode 3 of class b ");
    }*/
    public void meth2(){
        System.out.println("I am methode 3 of class b ");
    }
}
public class _48CWH_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        //a.meth2();
        //a.meth2(2);
        a.meth2();

        /*b B = new b();
        B.meth2();
        B.meth3();
        System.out.println(a.junaid());*/
        b B = new b();
        //B.meth2();



    }
}
