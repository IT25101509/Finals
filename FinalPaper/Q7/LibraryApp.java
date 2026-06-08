package FinalPaper.Q7;
import java.util.Scanner;

class LibraryBook{
   private String bookId;
   private String title;
   private String author;
   private int copiesAvailable;

    public LibraryBook(String title, String bookId, String author, int copiesAvailable) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void lendBook(int requested){
        if(copiesAvailable <= requested){
            System.out.println("Not enough copies available. Please check back later.");
        }
        else {
            copiesAvailable = copiesAvailable - requested;
            System.out.println("Book issued successfully!");
        }
    }

    public void printBookDetails(){
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Book Title : " + this.title);
        System.out.println("Author of the book : " + this.author);
        System.out.println("Number of copies we have : " + this.copiesAvailable);

    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        LibraryBook book1 = new LibraryBook("AAAAA" , "dsssdf" , "SAsdd" , 10);
        LibraryBook book2 = new LibraryBook("BBBBB" , "dadadd" , "fffadAsdd" , 20);

        book1.printBookDetails();
        System.out.println();
        book2.printBookDetails();
        System.out.println();

        book1.lendBook(12);
        book2.lendBook(19);

        System.out.println();

        book1.printBookDetails();
        System.out.println();
        book2.printBookDetails();
        System.out.println();
    }
}
