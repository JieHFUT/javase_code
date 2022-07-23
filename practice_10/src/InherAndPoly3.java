/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 18:24
 */

/**
 * 子类和父类中的成员重名的时候
 * 通过派生类对象访问父类与子类同名方法时，如果父类和子类同名方法的参数列表不同(重载)，根据调用
 * 方法适传递的参数选择合适的方法访问，如果没有则报错；如果父类和子类同名方法的原型一致(重写-后
 * 面讲)，则只能访问到子类的，父类的无法通过派生类对象直接访问到。
 */
class NewBase{
    public int a = 10;
    public int b = 20;

    public void method(int x){
        System.out.println("NewBase's function!");
    }

}






class NewDerived extends NewBase{
    public int a = 30;
    public int d = 40;

    public void method(boolean flg){
        System.out.println("NewDerived's function!");
    }

    public void test(){
        System.out.println(a);//30
        //如果重名了，子类优先访问自己的成员
        //如果想要访问父类的对象，那么就要在成员前面加上super关键字
        System.out.println(super.a);//10
        System.out.println(b);
        System.out.println(d);

        method(5);
    }



}





public class InherAndPoly3 {


    public static void main(String[] args) {

        NewDerived newDerived = new NewDerived();//并不创建父类的实例化对象
        newDerived.test();

    }
}
