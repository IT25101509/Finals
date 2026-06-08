package ExeptionHandeling.EX1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = io.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = io.nextInt();
        try {System.out.println(a / b);}
        catch(ArithmeticException exception1){
            System.out.println("Divide by 0 ! ...........");}
    }
}
