package Aggregation.EX1;

public class Library {
    private String library_name;
    private Book book1;
    private Book book2;
    public Library(String library_name, Book book1, Book book2) { // pass the value directly to the Reference variable
        this.library_name = library_name;
        this.book1 = book1;
        this.book2 = book2;
    }
    public void display_library_details(){
        System.out.println("Library name : " + this.library_name);
        book1.display_book_details();
        book2.display_book_details();
    }
}
