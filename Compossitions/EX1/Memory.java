package Compossitions.EX1;

public class Memory {
    private int memory_size;

    public Memory(int size){
        this.memory_size = size;
    }

    public int getMemory_size() {
        return memory_size;
    }

    public void display_memory_size(){
        System.out.println("Memory Size is : " + getMemory_size() + "GB");
    }
}
