package abnormal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-28
 * Time: 18:56
 */

public class Abnarmal {
    //异常

    public static void func1(int a){
        if(a == 10){
            throw new NullPointerException("a == 10");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        try{
            //同时只能抛出一个异常
            func1(10);
            System.out.println(array[10]);//如果没有异常处理，那么就会交给JVM去处理，程序则立即异常终止
            System.out.println("相同逻辑则不会执行！");
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();//打印当前异常信息
            System.out.println("捕捉到了一个数组越界异常或者空指针异常！可以采取手段如发邮件的方法通知程序员！");
        }
        System.out.println("其他业务逻辑代码执行！");
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        try{
            func1(10);
            //System.out.println(array[10]);//如果没有异常处理，那么就会交给JVM去处理，程序则立即异常终止
            System.out.println("相同逻辑则不会执行！");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//打印当前异常信息
            System.out.println("捕捉到了一个数组越界异常！可以采取手段如发邮件的方法通知程序员！");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("捕捉到了一个空指针异常！");
        }
        System.out.println("其他业务逻辑代码执行！");







    }
    public static void main1(String[] args) {

//        异常后面不会运行

//        int a = 10/0;
//        System.out.println(a);//ArithmeticException -- 算数异常

//        int[] array = null;
//        System.out.println(array.length);//NullPointerException ---- 空指针异常

//        int[] array = new int[2];
//        System.out.println(array[2]);//ArrayIndexOutOfBoundsException ---- 数组越界异常

//        递归产生的栈溢出叫做错误//StackOverflpwError


    }
}
