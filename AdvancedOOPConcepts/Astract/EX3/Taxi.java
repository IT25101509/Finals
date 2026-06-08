package AdvancedOOPConcepts.Astract.EX3;

public class Taxi extends Transport{
    private int basefee;

    public Taxi(String vehicleNumber, int distanceTravelled, int basefee) {
        super(vehicleNumber, distanceTravelled);
        this.basefee = basefee;
    }
    public double calculateFare() {
        return 20 * distanceTravelled + 50*(basefee);
    }
    void displayDetails(){
        System.out.println("-----------------Taxi--------------------");
        System.out.println("Vehicle number : " + this.vehicleNumber);
        System.out.println("Traveled distance : " + this.distanceTravelled);
        System.out.println("Total price for Taxi : " + calculateFare());
    }
}
