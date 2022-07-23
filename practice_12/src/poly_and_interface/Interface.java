package poly_and_interface;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 4:11
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 1、abstract修饰的方法叫做抽象方法，抽象方法没有实现过程，甚至花括号都可以省略不写
 * 2、abstract修饰的类叫做抽象类，抽象类不能用来实例化对象
 * 3、抽象类的成员变量和成员方法都是和正常类一样的，其存在的最大作用就是被继承
 * 4、当一个普通的类继承了这个抽象类以后，这个普通的类就必须覆盖抽象类中所有的抽象方法
 * 5、抽象类被继承后可以引用 子类对象 -------- 发生向上转型 ----- 发生多态
 * 6、final不能修饰抽象方法，也不能修饰抽象类
 * 7、抽象方法也不能被private修饰
 * 8、当一个抽象类继承了一个抽象类的时候，子类就不需要去覆盖父类的抽象方法
 * 9、当一个非抽象类继承了8中的子类，那么要覆盖父类、父类的父类... 的所有的抽象方法
 * 10、
 *
 */
//抽象类 ----- 不能实例化对象
abstract class Empty{
    public String name;
    public int age;

    public abstract void func1();//抽象方法
    public void func2(){

    }

}

//可以看到，当一个抽象类继承了一个抽象类的时候，子类就不需要去覆盖父类的抽象方法
abstract class  Empty2 extends Empty{
    public abstract void func3();
}


//可以看到，需要覆盖所有的抽象方法
class NoEmpty extends Empty2{
    @Override
    public void func1() {

    }

    @Override
    public void func3() {

    }
}









class Nomal extends Empty{
    @Override
    public void func1() {
        System.out.println("this is a ⚪！");
    }
}





























public class Interface {

    public static void main(String[] args) {

    }




}
