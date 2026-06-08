package AdvancedOOPConcepts.Interface.EX5;

public class Book {
    protected String bookId;
    protected String bookName;

    public Book(String bookName, String bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
    }
    public void print(){
        System.out.println("Employee Name  : " + this.bookName);
        System.out.println("Employee ID  : " + this.bookId);
    }
}
