/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 18:19
 */


/**
 * 子类和父类中的成员不重名的时候
 *
 */

class Base{
    public int a = 10;
    public int b = 20;

    public void method1(){
        System.out.println("Base's function!");
    }
}








class Derived extends Base{
    public int c = 30;
    public int d = 40;

    public void method2(){
        System.out.println("Derived's function!");
    }

    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        method1();
        method2();
    }



}








public class InherAndPoly2 {


    public static void main(String[] args) {

        Derived derived1 = new Derived();//并不创建父类的实例化对象
        derived1.test();

    }
}
