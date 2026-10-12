package _22_Multithreading;

class mythr extends  Thread{
    public  mythr(String name){
        super(name);
    }
    public void run(){
        int i = 35;
        System.out.println("Hellow junaid");
//        while (true){
//            System.out.println("I am a thread");
//        }
    }
}
public class _73_Constructor_Thread {
    public static void main(String[] args) {
        mythr t = new mythr("junaid");
        mythr t2 = new mythr("hassan");
        t.start();
        t2.start();
        System.out.println("the id of the thread t is : " + t.getId());
        System.out.println("the id of the thread t is : " + t.getName());

        System.out.println("the id of the thread t is : " + t2.getId());
        System.out.println("the id of the thread t is : " + t2.getName());



    }
}
