package _20_Polymorphism_In_Inheritance;
interface mycamera{
    void takeSnap();
    void RecordVideo();
    private void greeck(){
        System.out.println("Good morning : ");
    }
    default void recordVideo4k(){
        greeck();
        System.out.println("Recording in 4K.....");
    }
}
interface mywifi{
    String[] getNetwork();
    void connectTonetwork(String network);

}

class mycellphone{
    void callNumber(int phoneNo){
        System.out.println("Calling"+ phoneNo);
    }
    void pickcall(){
        System.out.println("connecting.....");
    }
}
class mySmartphone extends  mycellphone implements mywifi,mycamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void RecordVideo(){
        System.out.println("Talking Snap....");
    }
    public String[] getNetwork(){
        System.out.println("Getting lists of network...");
        String[] networklist = {"junaid","hassan","Ahaamad"};
        return networklist;
        //return getNetwork();
    }
    public void connectTonetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void samplemath(){
        System.out.println("meth1");
    }

}
public class _01_59polymorphism {
    public static void main(String[] args) {
        /*mySmartphone ms = new mySmartphone();
        ms.recordVideo4k();
        String[] st = ms.getNetwork();
        for (String item:st){
            System.out.println(item);
        }*/
        /*mycamera c1 = new mycamera() {
            @Override
            public void takeSnap() {

            }

            @Override
            public void RecordVideo() {

            }
        }*/
        mycamera c1 = new mySmartphone(); // interface mycamera ka object bnaya hu to isi ka data use kr sakta hu
        // this  is a smartphone but use its in camera
        //c1.getNetwork() // not allowed
        //c1.samplemath();
        c1.recordVideo4k();
        c1.takeSnap();

        mySmartphone c = new mySmartphone();
        c.recordVideo4k();
        c.takeSnap();
        c.RecordVideo();
        c. getNetwork();
        c.callNumber(123456);
        c.samplemath();
    }
}
