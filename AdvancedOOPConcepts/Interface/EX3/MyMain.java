package AdvancedOOPConcepts.Interface.EX3;

public class MyMain {
    public static void main(String[] args) {
        Printable employee = new Employee("Shanaka" , "JDAS55566556");
        Printable book = new Book("Madolduwa" , "AEDE586565565");

        employee.print();
        book.print();
    }
}
