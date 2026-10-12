package _47AccessModifier;
/*
Access Modifiers
│
├── private    → Same class
├── default    → Same package
├── protected  → Same package + subclass
└── public     → Everywhere

4 Pillars
│
├── Encapsulation → Data hiding + controlled access
├── Inheritance   → Reuse / IS-A relationship
├── Polymorphism  → One interface, multiple forms
└── Abstraction   → Hide implementation details

Abstraction
│
├── Abstract Class
└── Interface

super
│
├── super.variable
├── super.method()
└── super()
* */
/*  modifier        class         package           subclass               world

*   public           yes          yes                 yes                   yes
*   protected        yes           yes                yes                    not
*   default          yes           yes                yes                    not
*   private          yes           not                not                    not            */
/*
* .1>private : Sirf apni class ke andar access kar sakte ho.
* class Student {

    private int age = 20;

    void show() {
        System.out.println(age); // ✅
    }
}
* .2> default : Agar koi modifier nahi likha:
* class Student {

    int age = 20;
}
* Student s = new Student();

System.out.println(s.age);   // ✅
*
* .3>protected : Same class → ✅
Same package → ✅
Different package ki child class → ✅
* class Animal {

    protected void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    void display() {
        sound();   // ✅
    }
}
*
* .4> public : sb jagah access krakte h
* class Student {
    public int age = 20;
}
*
* private
│
└── Sirf same class

default
│
├── Same class
└── Same package

protected
│
├── Same class
├── Same package
└── Child class (different package)

public
│
├── Same class
├── Same package
├── Child class
└── Everywhere
*
* private
↓
Only Me

default
↓
My Package

protected
↓
My Package + My Children

public
↓
Everyone
*
*
* | `Feature`                       | `private`                                                | `protected`                             |
| ------------------------------- | --------------------------------------------------------- | --------------------------------------- |
| Same class                      | ✅ Yes                                                     | ✅ Yes                                   |
| Same package                    | ❌ No                                                      | ✅ Yes                                   |
| Child class (same package)      | ❌ Direct access not needed; inherited member inaccessible | ✅ Yes                                   |
| Child class (different package) | ❌ No                                                      | ✅ Yes (through inheritance)             |
| Other classes                   | ❌ No                                                      | ❌ No (outside package and not subclass) |
*/

import java.util.Scanner;
class class1{
    public int x = 5;
    protected int y = 15;
    int z = 20;  // default
    private int a = 90;

    public void math(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class class2 extends class1{

}
public class _01AccessModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class1 obj = new class1();
        //obj.math();
        System.out.println(obj.x); // public
        System.out.println(obj.y); // protected
        System.out.println(obj.z); // default
        //System.out.println(obj.a); // private

        class2 obj1 = new class2();
        System.out.println(obj.x); // public
        System.out.println(obj.y); // protected
        System.out.println(obj.z); // default
        //System.out.println(obj.a); // private
        obj1.math();

    }
}
