package interface_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 4:48
 *
 *
 *
 * 1、接口是一种行为的规范和标准，使用interface关键字来修饰
 * 2、接口之中的成员方法只能是抽象方法 ------ 所有的方法都默认为 public abstract修饰
 * 3、接口之中的成员变量默认为 public static final修饰
 * 4、接口当中的方法如果要实现，就必须使用 default来修饰
 * 5、接口中的静态方法，可以有具体的实现
 * 6、接口不能实例化，只能被继承
 * 7、一个普通的类可以通过 implements关键字实现接口 ---- 但是必须重写抽象方法
 * 8、一个抽象类继承另外一个抽象类，就可以不用重写父类的方法
 * 9、一个普通类如果要继承某个抽象类，例如8；就要把该类的父类，父类的父类的抽象方法全部覆盖一遍
 * 10、一个普通的类，可以通过implements来实现这个接口
 *
 *
 *
 */
interface ISape{
    //成员变量
    public static final int a = 10;
    int b = 20;



    //成员方法
    public abstract void func1();

    void fun2();

    default void func3(){
        System.out.println("接口当中的方法如果要实现，就必须使用 default来修饰");
    }

    public static void func4(){
        System.out.println("接口中的静态方法，可以有具体的实现");
    }
}







class ComeTureIF implements ISape{

    @Override
    public void func1() {
        System.out.println("fun1的重写方法！");
    }

    @Override
    public void fun2() {
        System.out.println("fun2的重写方法！");
    }
}










public class Interfac {


    public static void main(String[] args) {

        ISape iSape = new ComeTureIF();
        iSape.func1();
        iSape.fun2();
        iSape.func3();
        //静态方法的调用就必须用到类名
        ISape.func4();

    }
}
