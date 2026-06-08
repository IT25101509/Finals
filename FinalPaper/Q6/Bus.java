package FinalPaper.Q6;

public class Bus extends Vehicle{
    private String Bus_special_functiosn;

    public Bus(String brand, int speed, String Engine, Driver driver, String bus_special_functiosn) {
        super(brand, speed, Engine, driver);
        Bus_special_functiosn = bus_special_functiosn;
    }
    public void start(){
        System.out.println("Bus Can Start !");
    }
    public void display_Bus_details(){
        start();
        System.out.println("Bus special Function is : " + this.Bus_special_functiosn);
        super.display_vhicle_details();
    }
}
