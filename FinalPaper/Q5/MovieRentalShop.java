package FinalPaper.Q5;

import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String movieId;
    private String title;
    private double rentalPricePerDay;

    public Movie(String movieId, String title, double rentalPricePerDay) {
        this.movieId = movieId;
        this.title = title;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMovieId() {
        return movieId;
    }

    public void displayDetails(){
        System.out.println("Movie Id : " + this.movieId);
        System.out.println("Movie Name : " + this.title);
        System.out.println("rental price per day : " + this.rentalPricePerDay);
    }
}
public class MovieRentalShop {
    public static void main(String[] args) {
        ArrayList<Movie> catalog = new ArrayList<Movie>();
        Scanner io = new Scanner(System.in);
        while(true){
            System.out.print("Enter movie ID : ");
            String mID = io.next();
            if (mID.equals("S")){
                break;}
            System.out.println("Enter movie Name : ");
            String mName = io.next();
            System.out.println("Enter movie Price : ");
            double mprice = io.nextDouble();
            Movie movie = new Movie(mID , mName ,mprice);
            catalog.add(movie);
        }
        System.out.println("Enter you wan to remove : ");
        String remover = io.next();
        boolean found = false;
        for (int i = 0 ; i < catalog.size(); i++){
            if (catalog.get(i).getMovieId().equals(remover)){
                catalog.remove(i);
                found = true;
                System.out.println("Remove Success !");
                break;}}
        if(!found){
            System.out.println("Move is no found !");
        }
        for (int i = 0 ; i < catalog.size(); i++){
            catalog.get(i).displayDetails();
            System.out.println();
        }

    }
}
