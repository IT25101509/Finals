package Aggregation.EX1;

public class Book {
    private String title;
    private String author;

    public Book(String autor, String title) {
        this.author = autor;
        this.title = title;
    }

    public void display_book_details(){
        System.out.println("Title of the book : " + this.title + " & Author : " + this.author);
    }
}
