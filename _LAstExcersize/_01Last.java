package _LAstExcersize;
import java.util.ArrayList;
import java.util.Scanner;
class Book{
    public String name ,authar;
    Book(String name,String authar){
        this.name = name;
        this.authar = authar;
    }
}
class Library{
    ArrayList<Book>book;
    public Library(ArrayList<Book>book){
       this.book = book;
    }
    public  void addBook(Book book){
        System.out.println("The Book Has been Added To the liberary : ");
        this.book.add(book);
    }
    public void issuedBook(Book book,String issued_to){
        System.out.println("The Book Has been Issued From the Library : ");
        this.book.remove(book);
    }
}
public class _01Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithams1","CLRS1");
       // bk.add(new Book("Algorithams1","CLRS1"));
        bk.add(b1);
        Book b2 = new Book("Algorithams2","CLRS2");
       // bk.add(new Book("Algorithams2","CLRS2"));
        bk.add(b2);
        Book b3 =  new Book("Algorithams3","CLRS3");
        //bk.add(new Book("Algorithams3","CLRS3"));
        bk.add(b3);
        Book b4 = new Book("Algorithams4","CLRS4");
        //bk.add(new Book("Algorithams4","CLRS4"));
        bk.add(b4);


        Library obj = new Library(bk);
        obj.addBook(new Book("Algorith5","CRLST5"));
        System.out.println(obj.book);
        obj.issuedBook(b3,"Junaid");
        System.out.println(obj.book);
    }
}
