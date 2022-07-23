package polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 0:50
 */
public class Poly2 {
    /**
     * 在java中要实现多态，必须要满足如下几个条件，缺一不可：
     * 1. 必须在继承体系下
     * 2. 子类必须要对父类中方法进行重写
     * 3. 通过父类的引用调用重写的方法
     * 多态体现：在代码运行时，当传递不同类对象时，会调用对应类中的方法。
     *
     *
     * 1、静态方法不能进行重写
     * 2、private修饰的方法不能重写
     * 3、重写的时候，子类的访问权限要比父类的大才可以
     * 4、JDK7以后，被重写的方法返回值类型可以不同，但是必须是具有父子关系的 ------- 协变类型
     * 5、被final修饰的方法也是不可以被重写的
     */
    public static void func(One one){
        one.play();
    }

    public static void main(String[] args) {
        One one1 = new Two();
        One one2 = new Three();
        One one3 = new Four();
        one1.name = "";
        one2.name = "";
        one3.name = "";
        func(one1);
        func(one2);
        func(one3);


    }
}



class One{
    public String name;

    public void play(){
        System.out.println(this.name + "One is playing!");
    }
}


class Two extends One{
    @Override
    public void play() {
        System.out.println(this.name + "Two is playing!");
    }
}

class Three extends One{
    @Override
    public void play() {
        System.out.println(this.name + "Three is playing!");
    }
}

class Four extends One{
    @Override
    public void play() {
        System.out.println(this.name + "Four is playing!");
    }
}






























































