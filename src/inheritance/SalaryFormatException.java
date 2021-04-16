package inheritance;
//define own exception for salary
public class SalaryFormatException extends Exception{
    SalaryFormatException(){
        super();
    }
    SalaryFormatException(String message){
        super(message);
    }
}
