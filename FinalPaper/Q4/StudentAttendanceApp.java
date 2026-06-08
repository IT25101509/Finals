package FinalPaper.Q4;

import java.util.Scanner;

class LowAttendanceException extends Exception{
    public LowAttendanceException(String massage){
        super(massage);
    }
}
class InvalidLectureCountException extends Exception{
    public InvalidLectureCountException(String massage){
        super(massage);
    }
}
public class StudentAttendanceApp {
    public static void main(String[] args) {
        int total_lectures;
        int attended_lectures;

        int persentage = 0;

        Scanner io = new Scanner(System.in);
        System.out.print("Enter total lectures : ");
        total_lectures = io.nextInt();
        System.out.print("Enter attended lectures :");
        attended_lectures = io.nextInt();

        try {
            if(total_lectures <= 0){
                throw new InvalidLectureCountException("Total lectures must be greater than zero.");
            }
            persentage = (attended_lectures / total_lectures) * 100 ;

            if(persentage <= 75){
                throw new LowAttendanceException("Attendance percentage must be at least 75%.");
            }
            else {
                System.out.println("Attendance percentage  = " + persentage + "%");
                System.out.println("Attendance requirement satisfied.");
            }
        }
        catch (LowAttendanceException lowAttendanceException){
            System.out.println(lowAttendanceException.getMessage());
        }

        catch (InvalidLectureCountException invalidLectureCountException){
            System.out.println(invalidLectureCountException.getMessage());
        }


    }
}
