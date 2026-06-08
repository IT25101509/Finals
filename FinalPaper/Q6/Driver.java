package FinalPaper.Q6;

public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }
    public void display_Driver_details(){
        System.out.println("Driver name : " + this.name);
        System.out.println("Driver Licence  : " + this.licenseNumber);

    }


}
