package _46Package;

// package Create
// search in terminal in vs code
// .1>  javac junaid.java = create junaid class
// .2> javac -d . junaid.java = create Package folder
// .3> javac -d abc .java  // package create in abc folder
// .4> package folder.folderl1.folderl2 = create package folder in folderl1 and folderl2


import java.util.Scanner;
class library{
    String[] books;
    int NoBook;

    library(int n){
        this.books = new String[n];
        this.NoBook = -1;
    }

    void addbook(String Book){
        if(NoBook > books.length) {
            System.out.println("Overflow : ");
            return;
        }
        NoBook++;
        this.books[NoBook] = Book;

        System.out.println("Book has been added : "+ Book);
    }
    String removetopbook(){
        if(NoBook == 0){
            System.out.println("BookLibrary is Empty : ");
            return "";
        }
        String str = books[NoBook];
        //books[NoBook] = "";
        NoBook --;
        return str;

    }
    String RemoveBasedName(String name){
        if(NoBook == 0){
            System.out.println("BookLibrary is Empty : ");
            return "";
        }
        for(int i=0;i<=NoBook;i++){
            if(books[i] == name){
                String ans = books[i];
                books[i] = "Empty";
                return ans;
            }

        }
        return "This book is not found in the library : ";
    }
    void displayBook(){
        System.out.println("Total Books in Your Library : ");
        for (int i=0;i<=NoBook;i++){
            System.out.println(books[i]+" ");
        }
    }
}
public class _04Package {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Library Book : ");
        n = sc.nextInt();

        library obj = new library(n);

        obj.addbook("BruceLee");
        obj.addbook("KhanSir");
        obj.displayBook();
        System.out.println();
        System.out.println(obj.removetopbook());
        obj.displayBook();

        obj.addbook("History");
        obj.addbook("Science");
        obj.addbook("Math");

        System.out.println(obj.RemoveBasedName("Science"));
        obj.displayBook();

    }

}
