package _14_Oops;
class Eply{
    int salary;
    String name;

    public  int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setsalary(int s){
        salary = s;
    }
    public void setname(String n){
        name = n;
    }
}
public class CWH37 {
    public static void main(String[] args) {
        // q.01;
        Eply junaid = new Eply();
        junaid.name = "junaid";
        System.out.println(junaid.getname());
        junaid.salary = 245;
        System.out.println(junaid.getsalary());

        junaid.setname("junaid hassan");
        junaid.setsalary(1100);
        System.out.println(junaid.getname());
        System.out.println(junaid.getsalary());



    }
}
