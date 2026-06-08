package FinalPaper.Q3;
import java.util.Scanner;

class InvalidEmployeeIDException extends Exception{
    public InvalidEmployeeIDException(String massage){
        super(massage);
    }
}
class InvalidSecurityCodeException extends Exception{
    public InvalidSecurityCodeException(String massage){
        super(massage);
    }
}
public class EmployeeLoginApp {
    public static void main(String[] args) {
        String EmployeeID;
        String SecurityCode;

        Scanner io = new Scanner(System.in);

        System.out.print("Enter Employee ID:");
        EmployeeID = io.next();
        System.out.print("Enter Security Code:");
        SecurityCode = io.next();

        try {
            if(!EmployeeID.equals("EMP2025")){
                throw new InvalidEmployeeIDException("Invalid Employee ID! Employee ID does not match.");
            }
            if(!SecurityCode.equals("SEC@123")){
                throw new InvalidSecurityCodeException("Invalid Security Code! Security Code does not match.");
            }
            else {
                System.out.println("Access Granted!");
            }
        }
        catch (InvalidEmployeeIDException e){
            System.out.println(e.getMessage());
        }
        catch (InvalidSecurityCodeException f){
            System.out.println(f.getMessage());
        }
    }
}
