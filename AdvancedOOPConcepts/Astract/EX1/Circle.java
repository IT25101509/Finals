package AdvancedOOPConcepts.Astract.EX1;

public class Circle extends Shape{
    protected double redis;

    public Circle(int redis) {
        this.redis = redis;
    }
    public double calculate_area(){
        return 22/7* redis * redis;
    }
}
