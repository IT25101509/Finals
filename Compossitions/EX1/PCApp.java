package Compossitions.EX1;

public class PCApp {
    public static void main(String[] args) {
        //Create object for parent (Compression relation is directly connected with parent class. Using that parent class then access child class)
        //If DESTROY parent class can not access child classes
        Computer pc1 = new Computer("Tuf" , "i5" , 16);
        Computer pc2 = new Computer("Msi" , "i7" , 32);

        pc1.display_pc_details();
        System.out.println();
        pc2.display_pc_details();
    }
}

/*OUTPUT
 * Pc Model is : Tuf
 * Processor Model is : i5
 * Memory Size is : 16GB

 * Pc Model is : Msi
 * Processor Model is : i7
 * Memory Size is : 32GB
 */