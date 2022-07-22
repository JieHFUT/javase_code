/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 1:15
 */
public class MyDate2 {

    public int year;
    public int month;
    public int day;


    public MyDate2(){
        //调用本类中带有两个参数的构造方法month day
        this(12,23);//this();调用构造方法的时候必须放在该方法的第一行，否则报错！！
        System.out.println("这是一个没有参数的构造方法！");
    }
    public MyDate2(int day) {
        System.out.println("这是一个带一个参数的构造方法！");
        this.day = day;
    }
    public MyDate2(int month, int day) {
        System.out.println("这是一个带两个个参数的构造方法！");
        this.month = month;
        this.day = day;
    }
    public MyDate2(int year, int month, int day){
        System.out.println("这是一个带三个参数的构造方法！");
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * 设置日期
     */
    public void setDate2(int year, int month, int day){
        //public void setDate2(MyDate2 this, int year, int month, int day){  -----> 隐藏的this参数
        //this ---> this里面存的就是mydate2指向的对象的地址，是一个引用（代表当前参数的引用） -- 类类型
        //this区别形参和成员命名相同的时候，而且this只能在成员方法中去使用
        //在成员方法中所有的成员变量的引用都是通过这种方法去引用的
        //在成员方法中，this只能引用当前对象

        /**
         * this的用法
         * this.data----访问成员变量
         * this.func----访问成员方法
         * this(); -----调用构造方法
         */
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printDate2(MyDate2 this){
        System.out.println(year+"年"+month+"月"+day+"日");
    }

    public void func(){
        //在一个普通的成员方法中，this可以调用其他的成员方法（不加this也可以调用）
        this.printDate2();
        printDate2();
    }







    public static void main(String[] args) {

        MyDate2 myDate1 = new MyDate2();
        //MyDate2()中的小括号就是在调用构造方法，此时小括号里面没有传参，所以调用的是不带参数的构造方法
        myDate1.setDate2(2022,7,21);
        myDate1.printDate2();//2022年7月21日



        MyDate2 myDate2 = new MyDate2(213,4535,56);
        myDate2.setDate2(2023,8,22);
        myDate2.printDate2();//2023年8月22日

        MyDate2 myDate3 = new MyDate2(23,34);
        myDate3.printDate2();


        //初始化对象  ------  构造方法
        //如果在定义类的时候就给某些成员变量进行初始化 --> 就地初始化（改变默认初值）---- 重新给就地初始化的对象赋值可以更改

        /**
         * 构造方法
         * 方法名必须和类名相同
         * 没有返回值
         * ==========================================================================
         * 当我们实例化一个对象的时候-->为对象分配内存-->调用一个合适的构造方法（构造方法可以有多个）
         * ==========================================================================
         *当一个类没有构造方法的时候，编译器就会帮助我们自动构造一个不带参数的构造方法
         *当你自己写了一个构造方法之后，编译器就不会帮你生成一个构造方法
         *可以看到，不同的构造方法之间就形成了方法的重载
         *idea可以自动生成构造方法 - 右键-generate-constructor
         *
         * 在构造方法中，this(); 可以调用本类中其他的构造方法（一个构造方法中只能调用一次其他的构造方法）
         * 在一个普通的成员方法中，this可以调用其他的成员方法（不加this也可以调用）
         * 注意this调用不能形成环！！！
         *
         *
         */
        System.out.println("===============================");
        MyDate2 myDate4 = new MyDate2();
        myDate4.printDate2();


    }
}

