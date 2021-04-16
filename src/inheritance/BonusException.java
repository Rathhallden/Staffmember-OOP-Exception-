package inheritance;
//define own exception for bonus
public class BonusException extends Exception{
    BonusException(){
        super();
    }
    BonusException(String message){
        super(message);
    }
}
