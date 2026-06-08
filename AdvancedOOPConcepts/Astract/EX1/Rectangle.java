package AdvancedOOPConcepts.Astract.EX1;

public class Rectangle extends Shape{
    protected double side;
    public Rectangle(double side) {
        this.side = side;
    }
    public double calculate_area(){
        return side * side;
    }

}
