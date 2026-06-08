package Compossitions.EX1;

public class Computer {
    private String model_of_the_pc;
    private Processor processor; // Reference type variables import child class
    private Memory memory;
    public Computer(String pcmodel , String processor , int capacityGB){
        this.model_of_the_pc = pcmodel;
        this.memory = new Memory(capacityGB); // create child class object in parent class constructor
        this.processor = new Processor(processor);}
    public void display_pc_details(){
        System.out.println("Pc Model is : " + this.model_of_the_pc);
        processor.processor_details();
        memory.display_memory_size();
    }
}
