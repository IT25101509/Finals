package Inheritance.EX2;

public class StudentApp {
    public static void main(String[] args) {
        PersonEX2 p1 = new PersonEX2("AAA" , 20);
        StudentEX2 st1 = new StudentEX2("BBB" , 21 , "IT2200445" , "2025");
        GraduateStudentEX2 gst1 = new GraduateStudentEX2("CCC" , 20 , "IT25546445" , "2024" , "SE" , "Computing");

        p1.Display_person_Details();
        System.out.println();
        st1.display_student_details();
        System.out.println();
        gst1.display_graduate_student_details();

    }
}
