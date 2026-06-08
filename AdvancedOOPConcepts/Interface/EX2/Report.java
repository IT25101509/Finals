package AdvancedOOPConcepts.Interface.EX2;

public class Report implements Printable{
    protected String reportTitle;

    public Report(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public void printDetails(){
        System.out.println("Report title is : " + this.reportTitle);
    }
}
