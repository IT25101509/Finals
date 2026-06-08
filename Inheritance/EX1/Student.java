package Inheritance.EX1;

public class Student extends Person{
    protected String student_ID;
    public Student(String person_name, String student_ID) {
        super(person_name);
        this.student_ID = student_ID;
    }
    public void student_details(){
        super.displayPerson();
        System.out.println("Student ID : " + this.student_ID);
    }
}
