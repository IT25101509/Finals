package FinalPaper.Q1;

import java.util.Scanner;

class Student{
    private int studentID;
    private String studentName;
    private String degreeProgram;
    private double semesterFee;

     public Student(int studentID, String studentName, String degreeProgram, double semesterFee) {
         this.studentID = studentID;
         this.studentName = studentName;
         this.degreeProgram = degreeProgram;
         this.semesterFee = semesterFee;
     }
     public Student(int studentID, String studentName) {
         this.studentID = studentID;
         this.studentName = studentName;
         this.degreeProgram = "Not Assigned";
         this.semesterFee = 0.0;
     }
     public void displayStudentDetails(){
         System.out.println("Student ID      : " + this.studentID);
         System.out.println("Student Name    : " + this.studentName);
         System.out.println("assigned Degree : " + this.degreeProgram);
     }
     public double calculateFee(double registrationCharge){
         return registrationCharge + this.semesterFee;
     }
 }
 public class StudentManagementApp {
    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);

        System.out.println("Enter one student ");
        System.out.print("Enter Student  ID    : ");
        int stdID1 = io.nextInt();
        System.out.print("Enter Student Name   : ");
        String stdName1 = io.next();
        System.out.print("Enter Degree Program : ");
        String degree1 = io.next();
        System.out.print("Enter Semester Fee   : ");
        double fee1 = io.nextDouble();

        Student student1 = new Student(stdID1 , stdName1 , degree1 , fee1);


        System.out.println();
        System.out.println("Enter second student ");

        System.out.print("Enter Student  ID    : ");
        int stdID2 = io.nextInt();
        System.out.print("Enter Student Name   : ");
        String stdName2 = io.next();


        Student student2 = new Student(stdID2 , stdName2);
        student1.displayStudentDetails();
        System.out.println("Total fee : " + student1.calculateFee(500) + "RS");
        System.out.println();
        System.out.println();

        student2.displayStudentDetails();
        System.out.println("Total fee : " + student2.calculateFee(500) + "RS");
        System.out.println();
    }
}
