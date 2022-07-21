/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 22:49
 */

//类名是大驼峰，用class定义一个类
//一个Java文件只能有一个public类
//同一个文件夹下不能有两个类名是相同的
class Person{
    //1、属性 ----------- 定义在类当中，方法的外面 ----- 成员变量
    public String name;
    public int age;
    public double high;

    //2、方法 ----- 成员方法
    public void sleep(){
        System.out.println("睡觉！");
    }

    public void eat(){
        System.out.println("吃饭！");
    }
}









public class practice_03 {
    public static void main(String[] args) {
        //类和对象
        //oop语言 - Java是一门面向对象语言

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
    }
}
