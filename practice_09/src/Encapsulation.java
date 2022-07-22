/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 15:50
 */

public class Encapsulation {
    //在方法当中定义的变量是局部变量，而静态的变量属于类变量。随着类的加载而被创建
    //而局部变量是调用该方法的时候，才创建的。
    static boolean flg;

    public static void main(String[] args) {


        System.out.println(flg);
    }



}


