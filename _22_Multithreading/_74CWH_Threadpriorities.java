package _22_Multithreading;
class mythr1 extends  Thread{
    public  mythr1(String name){
        super(name);
    }
    public  void  run(){
        int i = 34;
       // System.out.println("Thank you : " + this.getName());
        while(i>20){
            System.out.println("Thank you : " + this.getName());
            i--;
        }

    }
}
public class _74CWH_Threadpriorities {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1("junaid1");
        mythr1 t3 = new mythr1("junaid2");
        mythr1 t4 = new mythr1("junaid3");
        mythr1 t5 = new mythr1("junaid5 (most importants )");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
