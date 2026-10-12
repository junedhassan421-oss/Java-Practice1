package _15_Access_Modifiers_40To44;
class  cylander {
    private int radius;
    private int height;

    public cylander(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    /*public  int getRadius(){
        return  radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }*/
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double Volume() {
        //return 3.14*radius*radius*height;
        return Math.PI * radius * radius * height;
    }


}
class rectangle{
    private  int length;
    private  int breadth;

    public rectangle() {
        this.breadth = 4;
        this.length = 5;
    }

    public rectangle(int breadth, int length) {   // constructors
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class _44CWH_Problem {
    public static void main(String[] args) {
        // 0.1
        /*cylander mycylander = new cylander();

        mycylander.setHeight(12);
        System.out.println(mycylander.getHeight());

        mycylander.setRadius(5);
        System.out.println(mycylander.getRadius());

        // 0.2
        System.out.println(mycylander.surfaceArea());
        System.out.println(mycylander.Volume());*/

        // 0.3 Question no. 1 and 2 hi without getter and setter
        /*cylander mycylander = new cylander(5,12);
        System.out.println(mycylander.surfaceArea());
        System.out.println(mycylander.Volume());*/

        // 0.4
        /*rectangle r = new rectangle();
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());*/
        rectangle r = new rectangle(12,56);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

        // 0.5 repeat of Sphere
        // Area -> 4*Pi*r^2
        // Volume -> 4/3*Pi*r^2








    }
}
