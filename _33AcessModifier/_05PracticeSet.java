package _33AcessModifier;
import java.util.Scanner;
class cylinder{
    private  int radius;
    private  int height;
    public int getRadius(){
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void print(){
        System.out.println("your height is : "+ height);
        System.out.println("Your radius is : "+ radius);
    }
    public double area(){
        //int pi = Math.PI;
        double area1 =  Math.PI * radius*radius*height;
        return area1;
    }
    public double surfaceArea(){
        /*2piR^2 + 2piRH*/
        double pi = Math.PI;
        double r = radius;
        double h = height;
        return  2*pi*r*r + 2*pi*r*h;
    }
}
public class _05PracticeSet {
   /* public static class cylender{
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylinder mycylinder = new cylinder();
        mycylinder.setHeight(12);
        int h = mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(25);
        System.out.println(mycylinder.getRadius());
        mycylinder.print();
        System.out.println("Area is : "+mycylinder.area());
        System.out.println("Surface Area Is : "+mycylinder.surfaceArea());
    }
}
