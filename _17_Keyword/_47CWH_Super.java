package _17_Keyword;
class Class1{
    int a;
    public int getA() {
        return a;
    }
    Class1(int y){
        a = y;

    }
    public int Return(){
        return 1;
    }
}
class DocClass extends Class1{
    DocClass(int c){
        super(c);
        System.out.println("Main ek constructor hoon : ");
    }
}
public class _47CWH_Super {
    public static void main(String[] args) {
            Class1 a = new Class1(65);
            DocClass d  = new DocClass(5);
            System.out.println(a.getA());

    }
}
