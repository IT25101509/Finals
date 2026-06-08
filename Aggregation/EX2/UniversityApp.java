package Aggregation.EX2;

// Main class to run the program
public class UniversityApp {

    public static void main(String[] args) {
        Professor p1 = new Professor("James Wilson", "Mathematics");
        Professor p2 = new Professor("Sarah Johnson", "Computer Science");
        Professor p3 = new Professor("Michael Brown", "Physics");
        Professor p4 = new Professor("Emily Davis", "Chemistry");
        Professor p5 = new Professor("Daniel Smith", "Software Engineering");

        Professor[] professors = {p1, p2, p3, p4, p5};
        University uni = new University("AAAAAA University", professors);
        uni.display_universiy_details();
    }
}