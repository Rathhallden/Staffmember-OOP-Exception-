package inheritance;
//define own exception for Hourwork
public class HourworkException extends Exception{
    HourworkException(){
        super();
    }
    HourworkException(String message){
        super(message);
    }
}
