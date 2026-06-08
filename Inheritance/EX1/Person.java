package Inheritance.EX1;

public class Person {

    protected String person_name;

    public Person(String person_name) {
        this.person_name = person_name;
    }

    public void displayPerson(){
        System.out.println("Person's name : " + this.person_name);
    }
}
