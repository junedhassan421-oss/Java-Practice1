package _52ThreadMethod;
/*
* Bilkul. Java ki Thread class ke important methods ko basic se samjho. Placement/interview ke liye sabse pehle start(), run(), sleep(), join(), getName(), setName(), getPriority(),
*  setPriority(), currentThread(), isAlive(), interrupt() important hain.*/
class mynewThr1 extends Thread{
    public mynewThr1(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        while(i>25){
            System.out.println("Thread you " + this.getName());
            i--;
        }
        //System.out.println("Thread you " + this.getName());
        /*while (true){
            System.out.println("Thread you " + this.getName());
        }*/
    }
}
class mynewThr2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thanks for using Thread");
        }
    }
}
public class _01Method {
    public static void main(String[] args) {
        mynewThr1 t1 = new mynewThr1("hassan");
        mynewThr2 t2 = new mynewThr2();

        // Both Thread ek sath start
        /*t1.start();
        t2.start();*/

        t1.start();
        //t1.join(); // jb tk t1 Thread methode finish na ho jaye tb tk t2 Thread start nhi hoga //
        t2.start();

    }
}
