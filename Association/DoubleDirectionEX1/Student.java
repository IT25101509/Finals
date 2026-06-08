package Association.DoubleDirectionEX1;

public class Student {
     String student_name;
     ClassRoom classRomm;
     public Student(String STDname, ClassRoom classRomm) {
        this.student_name = STDname;
        this.classRomm = classRomm;}
    public void display_Student_Details(){
        System.out.println("Student Name : " + this.student_name + " and Class Room : " + classRomm.ClassRomm);
    }
}
