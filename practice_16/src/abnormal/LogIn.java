package abnormal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 2:38
 */

//自定义异常！！！！！！


class LogIn {
    private String userName = "admin";
    private String password = "123456";
    public void loginInfo(String userName, String password) throws UserNameErrorExecption,
            PasswordErrorException{
        if (!this.userName.equals(userName)) {
            //System.out.println("用户名错误！");
            throw new UserNameErrorExecption("用户名错误参数！");
            //return;
        }
        if (!this.password.equals(password)){
            throw new PasswordErrorException("密码错误参数！");
            //System.out.println("密码错误！");
            //return;
        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args) {
        LogIn logIn = new LogIn();
        try {
            logIn.loginInfo("admin1", "123456");
        }catch (UserNameErrorExecption errorExecption){
            errorExecption.printStackTrace();
            System.out.println("用户名异常！");
        }catch (PasswordErrorException errorException){
            errorException.printStackTrace();
            System.out.println("密码异常！");
        }
    }

}















