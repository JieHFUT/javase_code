/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 23:46
 */
class Person {
    //1、字段 - filed ---- 成员变量
    public String name;
    public int age;


    //2、方法 - method --- 成员方法
    public void eat(){
        System.out.println("吃饭！");
    }

    public void sleep(){
        System.out.println("睡觉！");
    }


    public static void main(String[] args) {
        int a = 10;
        //实例化一个对象【通过一个new关键字创建了一个对象】 --- 即抽象出来了一个类
        Person person = new Person();

    }

}
