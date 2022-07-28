package abnormal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 2:59
 */
public class PasswordErrorException extends Exception{
    public PasswordErrorException(){
        super();
    }
    public PasswordErrorException(String message){
        super(message);
    }

}
