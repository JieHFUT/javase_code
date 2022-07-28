package abnormal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 2:49
 */
public class UserNameErrorExecption extends RuntimeException{
    public UserNameErrorExecption(){
        super();
    }
    public UserNameErrorExecption(String message){
        super(message);
    }
}
