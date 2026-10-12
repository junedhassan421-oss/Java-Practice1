package _45JavaPracticeSet;
import java.util.Scanner;
class library{
    String[] book;
    int NoBook = 0;
    library(){
        this.book = new String[100];
        NoBook = 0;
    }
    void addBook(String book){
        this.book[NoBook] = book;
        NoBook++;
    }
    void takedBook(String UsedBook){
        for(int i=0;i<this.book.length;i++){
            //if(UsedBook == book[i])
            if(this.book[i].equals(UsedBook)){
                System.out.println("This Book Are UsedFull : ");
                //this.book[i] = null;
                this.book[i] = "Empty";

                //NoBook--;

                return;
            }
            //System.out.println("*"+UsedBook);
        }
        System.out.println("This Book Does not Exist : ");
    }
    void printbook(){
        for (int i=0;i<NoBook;i++){
            System.out.println(i+">"+ "Available book are : "+ this.book[i]+" ");
        }
        System.out.println();
    }

    void returnBook(String ReturnBook){
        addBook(ReturnBook);
    }
}
public class _LiberaryClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library obj = new library();
        obj.addBook("AncientHistory");
       // obj.printbook();
        obj.addBook("MedibleHistory");
        obj.addBook("java");
        obj.addBook("Cpp");
        obj.addBook("Python");
        obj.printbook();

        System.out.println(obj.NoBook);
        obj.takedBook("Python");
        obj.printbook();
        obj.takedBook("java");
        obj.printbook();
        obj.returnBook("java");
        obj.printbook();
    }
}
