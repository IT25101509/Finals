package Association.DoubleDirectionEX1;

public class Main {
    public static void main(String[] args) {
        ClassRoom garde10A = new ClassRoom("Grade 10-A" , 5);
        Student student1 = new Student("AAAAA" ,garde10A);
        Student student2 = new Student("BBBBB" ,garde10A);
        garde10A.addStudent(student1);
        garde10A.addStudent(student2);
        garde10A.displayAllStudent();
    }



}
