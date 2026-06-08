package FinalPaper.Q2;

import java.util.Scanner;

class InvalidEmailException extends Exception{
     public InvalidEmailException(String EmaliError){
         super(EmaliError);
     }
}

class InvalidPinException extends Exception{
    public InvalidPinException(String passwordError){
        super(passwordError);
    }
}
public class DemoApp {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);

        System.out.print("Enter Email Address : ");
        String email = io.next();
        System.out.print("Enter PIN Code  : ");
        String password = io.next();

        boolean emailsValidation = false;
        boolean passwordValidation = false;
        try {
            if(!email.contains("@")){

                throw new InvalidEmailException("Error: Invalid email address. Email must contain '@'.");
            }
            else {
               emailsValidation = true;
            }
        }
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
         try {
             if(password.length() < 4){
                 throw new InvalidPinException("Error: PIN code must be at least 4 characters long.");
             }
             else {
                 passwordValidation = true;
             }
         }
        catch (InvalidPinException b){
            System.out.println(b.getMessage());
        }

       if(emailsValidation & emailsValidation){
           System.out.println("Login details accepted successfully.");
       }
    }
}
