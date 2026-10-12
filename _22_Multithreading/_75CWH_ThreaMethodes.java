package _22_Multithreading;
class newmythr1 extends  Thread{
    public  void  run(){
        /*while(true){
            System.out.println("Thank you : ");
        }*/

        /*int i =0;
        while(i<=50){
            System.out.println("Thank you : ");
            i++;
        }*/

        int i =0;
        while(true){
            System.out.println("Thank you : ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class mythread2 extends Thread{
    public void run(){
//        while (true){
//            System.out.println("Thank you so muchh junaid hassan for DSA: ");
//        }
        int j =0;
        while (j<=100){
            System.out.println("Thank you so muchh junaid hassan for DSA: ");
            j++;
        }
    }
}
public class _75CWH_ThreaMethodes {
    public static void main(String[] args) {
        newmythr1 t1 = new newmythr1();
        mythread2 t2 = new mythread2();

//        t1.start();
//        t1.join();  // from join jb tk t1 puri trah finish nhi ho jata tb tk t2 nhi start hoga error get error
//        t2.start();

      // error find  // agr error h to find technique
        /*t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();*/

        /*t1.start();
        t1.join();
        t2.start();*/

        t1.start();
        t2.start();
    }
}
