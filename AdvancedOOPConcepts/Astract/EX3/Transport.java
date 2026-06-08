package AdvancedOOPConcepts.Astract.EX3;

abstract class Transport {
    protected String vehicleNumber;
    protected int  distanceTravelled;

    public Transport(String vehicleNumber, int distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    abstract double calculateFare();
    abstract void displayDetails();

}
