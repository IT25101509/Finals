package ArrayList.EX1;

import java.util.ArrayList;

public class EX1 {
    public static void main(String[] args) {
        ArrayList guist = new ArrayList();
        guist.add("AAAAA");
        guist.add("dddadd");
        System.out.println(guist);
        guist.set(1 , "ssada");

        for (int i = 0 ; i < guist.size() ; i++){
            System.out.println("Guest " + (i + 1) + (" ") + guist.get(i));
        }

    }

}
