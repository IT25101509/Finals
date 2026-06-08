package Aggregation.EX1;

public class LibraryApp {
    public static void main(String[] args) {

        Book book1 = new Book("AAAA" , "aaaaa aaaaa");
        Book book2 = new Book("BBBB" , "bbbbb bbbbb");

        Library l1 = new Library("Libray" , book1 ,book2);

        l1.display_library_details();
        System.out.println();
        System.out.println();

        //Calling independently
        System.out.println("independent calling");
        book1.display_book_details();
        book2.display_book_details();

    }
}
