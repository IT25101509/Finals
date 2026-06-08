package AdvancedOOPConcepts.Interface.EX2;

public class Invoice implements Printable{
    protected String invoiceID;

    public Invoice(String invoiceID) {
        this.invoiceID = invoiceID;
    }
    public void printDetails(){
        System.out.println("Invoice ID is : " + this.invoiceID);
    }
}
