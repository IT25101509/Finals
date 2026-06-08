package Inheritance.EX2;

public class StudentEX2 extends PersonEX2 {

    protected String student_ID;
    protected String year;

    public StudentEX2 (String person_Name, int age , String student_ID ,String year){
        super(person_Name , age);
        this.student_ID = student_ID;
        this.year = year;
    }


    public void display_student_details(){
        super.Display_person_Details();
        System.out.println("Student ID : " + this.student_ID + " & academic year : " + this.year);
    }
}
