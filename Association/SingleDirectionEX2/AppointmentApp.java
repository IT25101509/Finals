package Association.SingleDirectionEX2;

public class AppointmentApp {
    public static void main(String[] args) {
        Doctor dr1 = new Doctor("AAAAAA" , "Cardiology");

        Appointment appointment1 = new Appointment("II554666" , "BBBBBBB" ,dr1);
        appointment1.display_appointment_detail();
    }
}
