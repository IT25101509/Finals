package Compossitions.EX1;

public class Processor {
    private String processor_model;

    public Processor(String processor_model){
        this.processor_model = processor_model;
    }

    public String getProcessor_model() {
        return processor_model;
    }

    public void processor_details(){
        System.out.println("Processor Model is : " + getProcessor_model());
    }
}
