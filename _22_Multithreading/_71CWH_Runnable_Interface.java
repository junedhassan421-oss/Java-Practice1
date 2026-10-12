package _22_Multithreading;
class mythreadRunnable1 implements  Runnable{
    public  void  run(){
        //System.out.println("I am a thread 1 not a threat1");
        for(int i=0;i<5;i++){
            System.out.println("I am a thread 1 not a threat1");
        }
    }
}

class mythreadRunnable2 implements  Runnable{
    public  void  run(){
        //System.out.println("I am a thread 2 not a threat2");
        for(int i=0;i<5;i++){
            System.out.println("I am a thread 2 not a threat2");
        }
    }
}
public class _71CWH_Runnable_Interface {
    public static void main(String[] args) {
        mythreadRunnable1 bullet1 = new mythreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        mythreadRunnable2 bullet2 = new mythreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
