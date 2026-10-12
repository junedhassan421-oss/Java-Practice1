package _15_Access_Modifiers_40To44;
class mynameEmployee{
    private int id;
    private String name;


    public  mynameEmployee(){   // constructor created
        id = 230009;
        name = "hussain";

    }
    /*public  mynameEmployee(String myname, int myid){   // constructor created
        //id = 230009;
        id = myid;
        name = myname;

    }*/
    public  mynameEmployee(String myname){   // constructor,  Access modifiers
        id = 23009;
        name = myname;

    }
    public  String getname(){
        return name;
    }
   /*public void setname(String n){
        this.name = n;
    }
    public void setid(int i){
        this.id = i;
    }*/
    public  int getid(){
        return id;
    }
}
public class _42CWH_Constructor {
    public static void main(String[] args) {
        /*mynameEmployee juned = new mynameEmployee();
        //juned.setname("HAssan");
        //juned.setid(20230009);
        System.out.println(juned.getname());
        System.out.println(juned.getid());*/

        /*mynameEmployee juned = new mynameEmployee("hasmatullah",23009);
        System.out.println(juned.getname());
        System.out.println(juned.getid());*/

        /*mynameEmployee juned = new mynameEmployee();
        System.out.println(juned.getname());
        System.out.println(juned.getid());*/

        mynameEmployee juned = new mynameEmployee("jk");
        System.out.println(juned.getname());
        System.out.println(juned.getid());
    }
}
