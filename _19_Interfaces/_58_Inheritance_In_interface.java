package _19_Interfaces;
interface sample_interface{
    void  math1();
    void  math2();
}
/*class child_sample_interface extends sample_interface{ // iterface ko ek interface
se hi inheritance kia ja sakta h class se nhi , class me bs sirf interface ko implemants kia ja sakta hai ;
    void math1();
    void math2();
    void math3();
    void math4();
}*/
interface  child_sample_interface extends sample_interface{
    /*void math1();
    void math2();*/
    void math3();
    void math4();
}
class mysampleclass implements child_sample_interface{
    public void math1(){
        System.out.println("Math1");
    }
    public void math2() {
        System.out.println("Math2");
    }
    public void math3(){
        System.out.println("Math3");
    }
    public void math4(){
        System.out.println("Math4");
    }
}
public class _58_Inheritance_In_interface {
    public static void main(String[] args) {
        mysampleclass ob = new mysampleclass();
        ob.math1();
        ob.math2();
        ob.math3();
        ob.math4();
    }

}
