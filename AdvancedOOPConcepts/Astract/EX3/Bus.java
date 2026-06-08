package AdvancedOOPConcepts.Astract.EX3;

public class Bus extends Transport{

    public Bus(String vehicleNumber , int  distanceTravelled) {
        super(vehicleNumber,distanceTravelled);
    }

    public double calculateFare() {
        return 10 * distanceTravelled;
    }
    void displayDetails(){
        System.out.println("-----------------Bus--------------------");
        System.out.println("Vehicle number : " + this.vehicleNumber);
        System.out.println("Traveled distance : " + this.distanceTravelled);
        System.out.println("Total price for Bus : " + calculateFare());
    }

}
