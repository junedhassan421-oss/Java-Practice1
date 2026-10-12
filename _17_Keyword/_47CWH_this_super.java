package _17_Keyword;
class Class{
    int a;
    public int getA() {
        return a;
    }
//    Class(int a){
    Class(int y){
        //this.a = a;
       //a = a;
       //this.a = y;
       a = y;

    }
    public int Return(){
        return 1;
    }
}
public class _47CWH_this_super {
    public static void main(String[] args) {
        Class a = new Class(5);
        System.out.println(a.getA());
    }
}
