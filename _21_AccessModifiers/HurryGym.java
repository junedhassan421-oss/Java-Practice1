package _21_AccessModifiers;

public class HurryGym {
    public  int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public  void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
    public static void main(String[] args) {
        System.out.println("I am class hurry gym main methode : ");
        HurryGym c = new HurryGym();

    }
}
