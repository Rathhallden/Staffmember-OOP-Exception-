package inheritance;
//define own exception for Rate
public class RateException extends Exception{
    RateException(){
        super();
    }
    RateException(String message){
        super(message);
    }
}
