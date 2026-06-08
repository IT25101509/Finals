package AdvancedOOPConcepts.Interface.EX1;

public class OfficeApp {
    public static void main(String[] args) {
        Scannerble scanning = new MultifuctionPrinter();
        Printable printing = new MultifuctionPrinter();
        scanning.scan();
        printing.print();
    }
}
