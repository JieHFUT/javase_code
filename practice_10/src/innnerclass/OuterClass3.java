package innnerclass;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 16:58
 */


class Anonymity{
    public int a = 19;

    public void test(){
        System.out.println("这是Anonymity类的成员方法！");
        System.out.println(this.a);
    }

}





public class OuterClass3 {

    //匿名内部类

    public static void main(String[] args) {
        //new Anonymity();  -------- 这是一个匿名对象
        //new Anonymity(){};  ------ 这是一个匿名内部类

        //匿名内部类访问成员变量
        new Anonymity(){

        }.a = 29;


        //匿名内部类访问成员方法
        new Anonymity(){

        }.test();//输出19


        //调用匿名内部类自己写的的方法
        new Anonymity(){
            public void test1(){
                System.out.println("调用匿名内部类自己写的的方法");
            }
        }.test1();

        //重写该类的方法
        new Anonymity(){
            @Override
            public void test() {
                System.out.println("再次调用的时候就调用重写的方法！");
            }
        }.test();



    }
}
