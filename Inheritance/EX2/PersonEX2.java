package Inheritance.EX2;

public class PersonEX2 {
    protected String person_Name;
    protected int age;

    public PersonEX2(String person_Name, int age) {
        this.person_Name = person_Name;
        this.age = age;
    }

    public void Display_person_Details(){
        System.out.println("Person's Name : " + this.person_Name + " & age : " + this.age);
    }
}
