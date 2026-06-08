package Compossitions.EX2;

public class SmartApp {
    public static void main(String[] args) {
        Smartphone mobile1 = new Smartphone("Sony" , "Snapdragon 888" , 4000); // create obj for parent constructor

        mobile1.display_smartphone_details(); //calling for "display_smartphone_details" method in parent
    }
}
