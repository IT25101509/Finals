package AdvancedOOPConcepts.Astract.EX2;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makesound();
        cat.eating();

        System.out.println();
        dog.makesound();
        dog.eating();
    }
}
