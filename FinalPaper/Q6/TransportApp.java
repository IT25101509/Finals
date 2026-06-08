package FinalPaper.Q6;

public class TransportApp {
    public static void main(String[] args) {

        Driver busDriver = new Driver("AAAa" , "2311AA23");
        Driver TruckDriver = new Driver("wjkad" , "23111993");

        Bus bus = new Bus("Ashok Layland" , 140 ,"Inline 6 cylinder" , busDriver ,"Transport passengers");
        Truck truck = new Truck("Scania S770" , 120 , "V8" , TruckDriver ,"Cargo Transport");

        bus.display_Bus_details();
        System.out.println();
        truck.display_Truck_details();
    }
}
