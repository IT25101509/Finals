package Compossitions.EX2;
//CHILD
public class Processor {
    protected String processor_model;

    public Processor(String processor_model){
        this.processor_model = processor_model;
    }

    public void display_processor_details(){
        System.out.println("Processor model is : " + this.processor_model);
    }
}
