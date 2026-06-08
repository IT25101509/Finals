package FinalPaper.Q6;

public class Truck extends Vehicle{
    private String Turck_special_functiosn;

    public Truck(String brand, int speed, String Engine, Driver driver, String turck_special_functiosn) {
        super(brand, speed, Engine, driver);
        Turck_special_functiosn = turck_special_functiosn;
    }
    public void start(){
        System.out.println("Truck can Start !");
    }
    public void display_Truck_details(){
        start();
        System.out.println("Bus special Function is : " + this.Turck_special_functiosn);
        super.display_vhicle_details();
    }

}
