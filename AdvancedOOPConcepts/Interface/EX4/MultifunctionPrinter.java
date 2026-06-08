package AdvancedOOPConcepts.Interface.EX4;

public class MultifunctionPrinter implements Printerble , Scannerble{
    public void print(){
        System.out.println("Count of copy " + COPIES);
    }
    public void scan(){
        System.out.println("Resolution of scanning : " + RESOLUTION);
    }
}
