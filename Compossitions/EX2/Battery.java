package Compossitions.EX2;
//CHILD
public class Battery {
    private int capacity;

    public Battery(int capacity){
        this.capacity = capacity;
    }

    public void display_battery_details(){
        System.out.println("Battery capacity is : " + this.capacity + "mAh");
    }
}
