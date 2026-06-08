package ArrayList.EX2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ss> test = new ArrayList();
        Scanner io = new Scanner(System.in);

        for(int i = 0 ; i < 6 ; i++){
            System.out.println("");
            ss nn = new ss("Chenitha" , 20);
            test.add(nn);
        }



        for(int i = 0 ; i < test.size() ; i++){
            test.get(i).displayDetails();
        }
    }
}
