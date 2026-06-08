package Dependency.EX1;

public class PrinterApp {
    public static void main(String[] args) {
       Document d1 = new Document("Exam Paper");
       Printer printer = new Printer();
       printer.print_function(d1);
    }
}
