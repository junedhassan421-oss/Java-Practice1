package _19_Interfaces;
interface mycamera{
    void takeSnap();
    void RecordVideo();
    //void recordVideo(); // Default methodes -> qki isko mySmartphone Class me implemants nhi kiya hu isliye ye Default de dega
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
    /*public void recordVideo4k(){
        System.out.println("Records 4k video ...."); // recordVideo4k ka upper methode not work becouse here create now
    }*/
    public String[] getNetwork(){
        System.out.println("Getting lists of network...");
        String[] networklist = {"junaid","hassan","Ahaamad"};
        return networklist;
        //return getNetwork();
    }
    public void connectTonetwork(String network){
        System.out.println("Connecting to " + network);
    }

}
public class _57DefaultMethode {
    public static void main(String[] args) {
        mySmartphone ms = new mySmartphone();
        //ms.greeck(); -> greeck methode ko directly use nhi kr sakte hoon qki private h
        ms.recordVideo4k();
        String[] st = ms.getNetwork();
        for (String item:st){
            System.out.println(item);
        }
    }
}
