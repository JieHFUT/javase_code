package polymorphic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 23:34
 */

class Father{
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name + "正在吃饭！");
    }
}





class Son extends Father{
    public String hobby;

    public void play(){
        System.out.println(this.name + "正在玩游戏！");
    }

    //方法的重写
    public void eat(){
        System.out.println(this.name + "不仅要吃饭还要喝饮料！");
    }
}






public class Poly1 {
    //具体点就是去完成某个行为，当不同的对象去完成时会产生出不同的状态



    public static void func1(Father father){

    }

    public static Father func2(){
        return new Son();
    }

    public static void main(String[] args) {

        Son son1 = new Son();
        son1.name = "wangrenjie";
        son1.eat();
        son1.play();

        Father father1 = new Father();
        father1.name = "wangzhibao";
        father1.eat();



        System.out.println("===============================================");
        /**
         * 三种常见的向上转型
         * 1、直接赋值 ------- 直接把子类引用给父类
         * 2、方法的参数
         * 3、方法的返回值
         */


        //1、直接赋值
        Son son2 = new Son();
        Father father2 = son2;
        //即 ------- 父类引用引用了子类的对象 ----- 叫做//向上转型//
        Father father3 = new Son();   //但是只能访问父类自己的成员
        father3.name = "张三";
        father3.eat();//张三不仅要吃饭还要喝饮料！ ----- 重写的时候调用了子类的方法
        //其实在编译的时候，调用的还是父类的方法，但是在运行的时候就调用了子类的重写方法
        //这个叫做运行是绑定 --- 动态绑定

        //2、方法的参数
        Son son3 = new Son();
        func1(son3);


        //3、方法的返回值
        func2();






    }


}
