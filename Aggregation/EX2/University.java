package Aggregation.EX2;

// This class represents a University
// It HAS-A relationship with Professor (Aggregation)
public class University {
    private String UniName;
    private Professor[] professor;
    public University(String uniName, Professor[] professor) {
        this.UniName = uniName;
        this.professor = professor;
    }
    public void display_universiy_details() {
        System.out.println("Name of the University : " + this.UniName);
        for (int i = 0; i < professor.length; i++) {
            professor[i].display_professor_details();
        }
    }
}