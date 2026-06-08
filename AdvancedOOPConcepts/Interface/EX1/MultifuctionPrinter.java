package AdvancedOOPConcepts.Interface.EX1;

public class MultifuctionPrinter implements Printable , Scannerble {
    public void print(){
        System.out.println("Print " + COPIES + " Copy ... ");}
    public void scan(){
        System.out.println("Scanning at  " + RESOLUTION + " ... ");
    }
}
