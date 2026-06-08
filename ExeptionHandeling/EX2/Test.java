package ExeptionHandeling.EX2;
class Myexpectation extends Exception{
    Myexpectation (String massage){
        super(massage);
    }
}
public class Test {
    public static void main(String[] args) {
        String name = "asar";
        String password = "122133";
        try {
            if(name.length() >= 6){
            }
            else {
                throw new ArithmeticException("User Name length is must be 6 characters");
            }
        } catch (ArithmeticException e) {
            System.out.println("User Name length is must be 6 characters");
        }
        try {
            if(password.length() >= 8){
            }
            else {
                throw new Myexpectation("User Password length is must be 8 characters");
            }
        } catch (Myexpectation e) {
            System.out.println(e.getMessage());//"User Password length is must be 8 characters"
        }
    }
}
