package AdvancedOOPConcepts.Interface.EX2;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("aaaaa");
        Invoice invoice = new Invoice("bbbbbb");

        Printable[] printables = {report ,invoice};

        for (int i = 0 ; i < printables.length ; i++){
            printables[i].printDetails();
        }
    }
}
