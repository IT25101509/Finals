package Association.SingleDirectionEX2;

public class Doctor {
    private String DoctorName;
    private String specialFor;

    public Doctor(String doctorName, String specialFor) {
        DoctorName = doctorName;
        this.specialFor = specialFor;
    }

    public void display_doctor_details(){
        System.out.println("Doctors name : (Dr.) " + this.DoctorName);
        System.out.println("Special for : " +this.specialFor);
    }
}
