package _22_Multithreading;
class  myThreade extends Thread{
    @Override
    public void  run(){
        int i =0;
        while (i<40){
            System.out.println("My Threade is running , i am happy");
            System.out.println("I am always happy : ");
            i++;

        }
    }
}
class myThreade2 extends Thread{
    public void  run(){
        int i =0;
        while (i<40){
            System.out.println("My Threade2 is running , i am sad");
            System.out.println("I am always sad : ");
            i++;

        }
    }
}
public class _70CWH_Create_threadByExtending {
    public static void main(String[] args) {
        myThreade t1 = new myThreade();
        myThreade2 t2 = new myThreade2();
        t1.start();
        t2.start();
    }
}
