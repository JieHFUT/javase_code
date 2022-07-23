package innnerclass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 15:16
 */
public class OuterClass2 {

    public int data1 = 10;
    private int data2 = 20;
    public static int data3 = 30;

    public void method(){
        System.out.println("OuterClass2：method();");
    }

    /**
     * 静态内部类
     * 1、如何实例化静态内部类 --- 不依赖外部类实例对象
     * 2、OuterClass2.InterClass interClass = new OuterClass2.InterClass();
     * 3、在静态内部类当中，只能访问外部类的静态的成员，除非在内部类中实例化外部类的对象
     * 4、
     * 5、
     * 6、
     * 7、
     * 8、
     */
    static class InterClass{

        public int data4 = 40;
        private int data5 = 50;
        public static int data6 = 60;

        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2 outerClass21; //相当于一个内部类的成员变量，值为null

        InterClass(){
            System.out.println("InterClass的构造方法！");
        }
        InterClass(OuterClass2 outerClass21){
            this.outerClass21 = outerClass21;
            System.out.println("这是内部类带一个参数的构造方法！");
        }

        public void method(){
            System.out.println("InterClass的普通方法！");
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(outerClass2.data1);
            System.out.println(outerClass2.data2);
            //如果实例化内部类对象构造函数没有传参，此时outerClass21为空指针！下面者两个输出空指针异常
            System.out.println(outerClass21.data1);
            System.out.println(outerClass21.data2);
        }
    }

    public static void main(String[] args) {
        //不需要实例化外部类对象
        OuterClass2.InterClass interClass = new OuterClass2.InterClass();
        interClass.method();




    }

}
