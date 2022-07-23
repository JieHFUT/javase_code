package innnerclass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 5:27
 */
public class OuterClass {
    //内部类 ------ 3种
    public int data1 = 10;//实例成员变量（普通成员变量）
    private int data2 = 20;
    public static int data3 = 30;


    //外部类成员方法
    public void methodOut(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.data1);
        System.out.println(InnerClass.data6);
    }

    /**
     * 实例内部类
     * 1、如何去实例化一个对象
     * 2、实例内部类当中不能定义静态的成员变量。除非编译的时候是确定的值 ------ 加final就可以
     * 3、public static final int data6 = 60;
     * 4、在实例内部类中和外部类的成员变量重名了？ ----------- 优先使用自己的
     * 5、内部类如何访问外部类：System.out.println("内部类访问外部类："+OuterClass.this.data1);
     *    即证明了实例内部类中不仅仅包含了自己内部类的this，而且包含了外部类的this
     * 6、内部类中不能定义静态的方法
     * 7、
     */
    class InnerClass{

        public int data1 = 100000;
        public int data4 = 40;
        private int data5 = 50;
        //public static int data6 = 60; -------- 修饰符 'static' 仅允许在常量变量声明中使用()
        public static final int data6 = 60;

        //内部类静态方法
        //public static final void func(){
        //    System.out.println();
        //}
        //内部类innnerclass.OuterClass.InnerClass中的静态声明非法，内部类不能定义静态方法

        //内部类构造方法
        public InnerClass(){
            System.out.println("InnerClass的构造方法！");
        }
        //内部类成员方法
        public void method(){
            System.out.println("内部类访问外部类："+ OuterClass.this.data1);
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println("InnerClass的一个method方法！");
        }

    }





    public static void main(String[] args) {
        OuterClass outerClass1 = new OuterClass();
        OuterClass.InnerClass innerclass1 = outerClass1.new InnerClass();
        innerclass1.method();
        System.out.println("=========================================");
        OuterClass outerClass2 = new OuterClass();
        outerClass2.methodOut();




    }




    public static void main1(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.data1);

        //外部类名.内部类名  变量 = 外部类对象的引用.new InnerClass();
        OuterClass.InnerClass innerclass1 = outerClass.new InnerClass();
        OuterClass.InnerClass innerclass2 = new OuterClass().new InnerClass();
        //new OuterClass()：匿名对象(创建了对象但是没有名字) ---- 一般使用在只使用一次的时候
        System.out.println(new OuterClass().data1);
        //System.out.println(new OuterClass().data2);


    }
}
