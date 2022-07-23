package inher_and_poly;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 20:40
 */


class Base{
    public int a = 98;



}





class SubClass extends Base{
    public char a = 99;

    public void func1(){
        a = 97;
    }
}




public class Inheritance1 {
    //继承
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.a);//99 --- c
    }


}
