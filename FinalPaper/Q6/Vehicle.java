package FinalPaper.Q6;

public class Vehicle {
    protected String brand;
    protected int speed;
    Engine engine;
    Driver driver;
    public Vehicle(String brand, int speed , String Engine , Driver driver) {
        this.brand = brand;
        this.speed = speed;
        this.driver = driver;
        this.engine = new Engine(Engine);
    }
    public void start(){
        System.out.println("Vehicle Can Start ! ");
    }
    public void display_vhicle_details(){
        System.out.println("Vehicle brand : " + this.brand);
        System.out.println("Vehicle speed : " + this.speed);
        engine.typeoftheengine();
        driver.display_Driver_details();
    }
}
