package abnormal;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-28
 * Time: 18:56
 */

/**
 * 程序先执行 try 中的代码
 * 如果 try 中的代码出现异常, 就会结束 try 中的代码, 看和 catch 中的异常类型是否匹配.
 * 如果找到匹配的异常类型, 就会执行 catch 中的代码
 * 如果没有找到匹配的异常类型, 就会将异常向上传递到上层调用者.
 * 无论是否找到匹配的异常类型, finally 中的代码都会被执行到(在该方法结束之前执行).
 * 如果上层调用者也没有处理的了异常, 就继续向上传递.
 * 一直到 main 方法也没有合适的代码处理异常, 就会交给 JVM 来进行处理, 此时程序就会异常终止.
 */

public class Abnarmal {
    //异常


    public static int func2(){
        try {
            System.out.println(10/10);
            return 10;
        }catch (ArithmeticException e){
            System.out.println("捕捉到了算数异常！");
        }finally {
            //由于finally语句一定会被执行，所以不建议在finally语句中加return
            return -1;
        }
    }
    public static void func1(int a){
        if(a == 10){
            throw new NullPointerException("a == 10");
        }
    }

    public static void main(String[] args) {
        System.out.println(func2());

    }
    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println(10/a);
            System.out.println("wdqwefwef");
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("捕获到了算数异常！");
        }finally {
            //不管是否发生异常，finally一定会被执行，所以这里可以用来关闭资源
            System.out.println("一般用来关闭资源！");
            scanner.close();
        }
        System.out.println("其他业务代码执行情况！");
    }
    public static void main3(String[] args) {
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
