package Compossitions.EX2;
//PARENT
public class Smartphone {

    private Battery battery; // Reference variables
    private Processor processor;// Reference variables

    private String smart_phone_model; // class variables

    public Smartphone(String smart_phone_model, String processor, int battery) {
        this.smart_phone_model = smart_phone_model;
        this.processor = new Processor(processor); // Create obj in parent constructor
        this.battery = new Battery(battery);       // Create obj in parent constructor
    }

    public void display_smartphone_details(){
        System.out.println("Smart phone model : " + this.smart_phone_model);
        processor.display_processor_details(); // calling method from Processor class
        battery.display_battery_details();// calling method from Battery class
    }
}
