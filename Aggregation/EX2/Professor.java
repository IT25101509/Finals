package Aggregation.EX2;

// This class represents a Professor entity
public class Professor {

    // Instance variables (data members)
    private String professorName;
    private String subgect;

    // Constructor to initialize Professor object
    public Professor(String professorName, String subgect) {
        this.professorName = professorName;
        this.subgect = subgect;
    }

    // Method to display professor details
    public void display_professor_details() {
        System.out.println(
                "Professor Name : Prof. " + this.professorName +
                        " and Subject : " + this.subgect
        );
    }
}