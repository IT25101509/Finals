package Association.SingleDirectionEX2;

public class Appointment {
    private String appointmentId;
    private String patientName;
    private Doctor doctor;

    public Appointment(String appointmentId, String patientName, Doctor doctor) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctor = doctor;
    }

    public void display_appointment_detail(){
        System.out.println("Appointment ID : " + this.appointmentId);
        System.out.println("Patient Name : (Mr/Ms)" + this.patientName);
        doctor.display_doctor_details();
    }
}
