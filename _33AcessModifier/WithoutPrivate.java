package _33AcessModifier;
import java.util.Scanner;
class cylender{
    int height;
    int radius;

    public void area(){
        double pi = Math.PI;
        System.out.println("Your area is : " +pi*radius*radius*height);
    }
}
public class WithoutPrivate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cylender cy = new cylender();
        cy.height = 40;
        cy.radius = 15;
        cy.area();

    }
}
