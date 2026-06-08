package AdvancedOOPConcepts.Astract.EX4;

public class Rectangle extends Shape{

    protected int lengthOfSideA;
    protected int lengthOfSideB;

    public Rectangle(int lengthOfSideA, int lengthOfSideB) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
    }

    public void get_area(){
        System.out.println("Rectangle area = " + (lengthOfSideA* lengthOfSideB));
    }

}
