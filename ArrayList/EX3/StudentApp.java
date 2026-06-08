package ArrayList.EX3;

import java.util.ArrayList;
public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();

        Student student1 = new Student("AAA", "112213" ,"Sw");
        Student student2 = new Student("BBB", "441321" ,"Sd");
        Student student3 = new Student("CCC", "453555" ,"Ss");

        student.add(student1);
        student.add(student2);
        student.add(student3);

        for(int i = 0 ; i < student.size() ; i++){
            student.get(i).display_details();
            System.out.println();
        }
    }
}
