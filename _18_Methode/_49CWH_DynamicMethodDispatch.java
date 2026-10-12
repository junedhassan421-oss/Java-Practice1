package _18_Methode;
class one{
    public void name(){
        System.out.println("my name is java ");
    }
    public void grit(){
        System.out.println("Good morning ! ");
    }
}
class two extends one{
    public void welcome(){
        System.out.println("welcome to you ");
    }
    public void name(){
        System.out.println("my name is java in class two");
    }
}
public class _49CWH_DynamicMethodDispatch {
    public static void main(String[] args) {
        /*one obj = new one();
        obj.name();*/

        one obj = new two();
        //two obj = new one();
        obj.name();
        obj.grit();
        two o = new two();
        o.welcome();


    }
}
