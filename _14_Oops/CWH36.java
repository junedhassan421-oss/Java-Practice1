package _14_Oops;
class Employee{
    int id ;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is "+ id);
        System.out.println("And my name is "+ name);
    }
}
public class CWH36 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee junaid = new Employee();
        Employee hassan = new Employee();

        junaid.id = 012;
        junaid.salary = 15000;
        junaid.name = "junaid hassan";

        hassan.id = 011;
        hassan.salary = 18000;
        hassan.name = "md hassan";

        junaid.printdetails();
        hassan.printdetails();

    }
}
