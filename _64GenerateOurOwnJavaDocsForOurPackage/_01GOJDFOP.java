package _64GenerateOurOwnJavaDocsForOurPackage;
// Java Documentation >>>>>>>>>>>>>>>>>>>>> Java 14 Docs.
import java.util.Scanner;

// Tools = Generate javadocs
// class ke just upper java docs comments hoga to wo class ke liye h or method ke just upper hoga to wo methode ke liye h
// /** Java docs comments

/**
 * Represents a student.
 * This is <i>italic</i>mord<p>This is a new paragraph<p/>
 * @author junaid (JVM)
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/on/java/javase/14/docs/api/index.html"target="_blank">java Docs</a>
 * This class stores student information.
 */

class Student {
    private String name;
    private int age;
    /**
     * Creates a Student object.
     *
     * @param name student's name
     * @param age student's age
     * @return
     *
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * Returns the student's name.
     *
     * @return student's name
     */
    public String getName() {
        return name;
    }
    /**
     * Calculates whether the student is an adult.
     *
     * @return true if age is 18 or above, otherwise false
     */
    public boolean isAdult() {
        return age >= 18;
    }
    /**
     * @param i this is the first number to add
     * @param j this is the second number to add
     * @return sum of two number as an on integer
     * @throw Exception if i is 6
     * @deprecated  this method id depreated please use + operator
     * */
    public int add(int i, int j)throws Exception{
        if (i == 0) {
            throw new Exception();
        }
        int c = age + j;
        return c;
    }
}
public class _01GOJDFOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
