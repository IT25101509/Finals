package AdvancedOOPConcepts.Astract.EX4;

public class Squer extends Shape{

    protected int onesidelength;

    public Squer(int onesidelength) {
        this.onesidelength = onesidelength;
    }
    public void get_area(){
        System.out.println("Area of the Sure is = " + (onesidelength*onesidelength));
    }
}
