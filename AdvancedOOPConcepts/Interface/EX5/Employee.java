package AdvancedOOPConcepts.Interface.EX5;

public class Employee implements Printble{
    protected String EmpId;
    protected String EmpName;

    public Employee(String empName, String empId) {
        EmpName = empName;
        EmpId = empId;
    }

    public void print(){
        System.out.println("Employee Name  : " + this.EmpName);
        System.out.println("Employee ID  : " + this.EmpId);
    }
}
