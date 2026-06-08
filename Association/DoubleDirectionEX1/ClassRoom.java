package Association.DoubleDirectionEX1;

public class ClassRoom {
     String ClassRomm;
     Student[] students;
    private int count = 0;
    public ClassRoom(String classRomm, int count) {
        ClassRomm = classRomm;
        students = new Student[count];
    }
    public void addStudent(Student student){
        students[count] = student;
        count++;}
    public void displayAllStudent(){
        System.out.println("Class name : " + ClassRomm);
        for(int i = 0 ; i < count ; i++){
            System.out.println("Student name : " + students[i].student_name);
        }
    }
}
