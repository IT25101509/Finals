package AdvancedOOPConcepts.Interface.EX3;

public class Book implements Printable{

    protected String bookID;
    protected String bookName;

    public Book(String bookName, String bookID) {
        this.bookName = bookName;
        this.bookID = bookID;
    }

    public void print(){
        System.out.println("Book Name : " + this.bookName + " & book ID : " + this.bookID);
    }
}
