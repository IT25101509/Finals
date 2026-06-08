package AdvancedOOPConcepts.Astract.EX4;

public class CalculateArea {
    public static void main(String[] args) {
        Shape squer = new Squer(10);
        Shape rectangle = new Rectangle(13 , 21);

        squer.get_area();
        rectangle.get_area();
    }
}
