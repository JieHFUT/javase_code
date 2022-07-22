package com.hfut.nnn;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 2:00
 */
public class Student {

    public String name;
    public int age;
    public double score;


    {
        //构造块(实例代码块)
        System.out.println("一般用来初始化 实例(普通) 成员变量");
        this.name = "王仁杰";
        this.age = 22;
        this.score = 98;
    }



    static {
        //静态代码块，不依赖对象
        System.out.println("一般用于初始化静态的数据成员！");
        Student.classes = "高三三班！";
    }





    public static String classes;//(类变量) ---- 存放在方法区里面，不依赖对象
    //不属于某个具体的对象，是所有对象所共享的 - 访问直接通过  类名.  即可
    //静态方法没有隐藏的this引用参数，因此不能在静态方法中访问任何非静态成员变量

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", class=" + classes +
                '}';
    }

    private void testPrivateFunc(){
        System.out.println("测试一下私有的成员方法在同包其他类之中如何封装！");
    }

    public void getTestPrivateFunc(){
        this.testPrivateFunc();
    }

    public void doClass(){
        System.out.println(this.name + "写作业！");
    }

    public static void eat(){
        //System.out.println(this.name + "正在吃饭！"); ---- java: 无法从静态上下文中引用非静态 变量 this
        System.out.println("这是一个静态的成员方法！" + classes + "正在吃东西！");
    }



    public static void main(String[] args) {

        Student.classes = "信管20-2班";
        Student.eat();
        /**
         * 在方法当中定义的变量是局部变量，而静态的变量属于类变量。
         * 随着类的加载而被创建，而局部变量是调用该方法的时候，才创建的。
         * 所以显而易见，普通的成员方法之中是可以访问静态的方法/变量的
         *                    静态的方法是不能访问成员变量/成员方法
         *
         *
         *
         * 静态代码的初始化
         * 代码块：使用 {} 定义的一段代码称为代码块
         * =================================
         * 构造块(实例代码块)
         * 静态块()
         * 普通代码块(本地代码块)
         * 同步代码块（后续讲解多线程部分再谈）
         *===============================
         *
         */


        {
            //普通代码块(本地代码块)
            System.out.println("emmmm");
        }


        /**
         * 在调用构造函数之前，先会执行构造代码块 - 此时就可以给普通成员变量赋值
         * 静态代码块会在构造代码块之前执行
         * 当你实例化不止一个对象的时候，静态代码块只会执行一次
         *
         * 静态代码块有多个的时候，就根据定义的顺序进行执行
         */
        Student student = new Student("吴迪",21,99.9);
        System.out.println(student);









    }
}
