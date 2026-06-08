package Inheritance.EX2;

public class GraduateStudentEX2 extends StudentEX2{

    protected String Specialization;
    protected String faculty;

    public GraduateStudentEX2 (String person_Name, int age , String student_ID ,String year , String Specialization ,String faculty){
        super(person_Name, age, student_ID, year);
        this.Specialization = Specialization;
        this.faculty = faculty;
    }
    public void display_graduate_student_details(){
        super.display_student_details();
        System.out.println("Graduate student Specialization : " + this.Specialization + " & faculty : " + this.faculty);
    }
}
