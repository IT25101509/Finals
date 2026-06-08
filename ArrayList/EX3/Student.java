package ArrayList.EX3;

public class Student {
    private String id;
    private String name;
    private String cource;

    public Student(String name, String id, String cource) {
        this.name = name;
        this.id = id;
        this.cource = cource;
    }

    public void display_details(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student ID : " + this.id);
        System.out.println("Course : " + this.cource);
    }
}
