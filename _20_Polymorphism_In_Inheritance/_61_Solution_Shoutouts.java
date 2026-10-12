package _20_Polymorphism_In_Inheritance;
class library{
    String[] book;
    int no_of_books;
    library(){
        this.book = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String book){
        this.book[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added : ");
    }
    void ShowAvailableBooks(){
        System.out.println("Available Books are:");
        for(String book : this.book){
            if (book==null){
                //break;
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issuedBooks(String books){
        for(int i=0;i<this.book.length;i++){
            /*String b = this.book[i];
            if (b==null) break;
            System.out.println("The book has been issued ! ");
            b = null;*/

            if (this.book[i] == null){
                System.out.println("The books has been issued:");
                this.book[i] = null;
                return;
            }
            //System.out.println("* " + book);
        }
        System.out.println("this books does not exists ! ");
    }
    void returnBook(String book){
        //this.book[no_of_books] = book;
        addBooks(book);
    }
}
public class _61_Solution_Shoutouts {
    public static void main(String[] args) {
        // you have to implements a library using java class Library;
        // Methode: addBook , issueBook returnBook showAAvailableBook
        // properties: Arrays to store the issued books
        // ;
        library centralLibrary = new library();
        centralLibrary.addBooks("Think and grow Rich");
        centralLibrary.addBooks("Algorithms");
        centralLibrary.addBooks("C++");
        centralLibrary.addBooks("JAVA");
        centralLibrary.ShowAvailableBooks();



        centralLibrary.issuedBooks("Java");
        centralLibrary.ShowAvailableBooks();
        centralLibrary.returnBook("C++");
        centralLibrary.ShowAvailableBooks();

    }
}
