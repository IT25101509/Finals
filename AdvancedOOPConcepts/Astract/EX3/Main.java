package AdvancedOOPConcepts.Astract.EX3;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus("BUS2226566" , 120);
        Transport taxi = new Taxi("TAXI2226566" , 120 , 9);

        bus.calculateFare();
        bus.displayDetails();
        taxi.calculateFare();
        taxi.displayDetails();



    }
}
