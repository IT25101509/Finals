package AdvancedOOPConcepts.Interface.EX3;

public class Employee implements Printable{
    protected String employeeName;
    protected String employeeID;

    public Employee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }
    public void print(){
        System.out.println("Employee Name : " + this.employeeName + " & employee ID : " + this.employeeID);
    }
}
