package ArrayList.EX4;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String ISBN;
    private String title;

    public Book(String title, String ISBN) {
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }
    public void display_book_details(){
        System.out.println("Book name : " + this.title + " and ISBN : " + this.ISBN);
    }

}
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<>();
        Scanner io =new Scanner(System.in);

        while (true){
            System.out.print("Enter the ISBN : ");
            String isbn = io.next();
            if(isbn.equals("-99")){
                break;
            }
            System.out.print("Enter the Book name : ");
            String bookname = io.next();
            Book book = new Book(bookname , isbn);
            inventory.add(book);
            System.out.println();

        }
        System.out.print("Success !");

        System.out.println();
        System.out.print("Enter the ISBN for remove a book : ");
        String remove = io.next();

        boolean found = false;
        for(int i = 0; i < inventory.size() ; i++){
            if(inventory.get(i).getISBN().equals(remove)){
                inventory.remove(i);
                found = true;
            }
        }
        if(found){
            System.out.println("Remove Success full ! ");
        }
        else {
            System.out.println("Book is not exist !");

            System.out.println();
            System.out.println("Updated .......");
            for (int i = 0 ; i < inventory.size() ; i++){
                inventory.get(i).display_book_details();
            }
        }



    }
}
