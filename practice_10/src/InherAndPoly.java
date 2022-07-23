/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 4:25
 */



/*    原猫狗类
===================================================
class Cat{
    public String name;
    public String sex;
    public int age;
    public float weight;

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
    public void sleep()
    {
        System.out.println(this.name + "正在睡觉");
    }
    public void mew(){
        System.out.println(this.name + "喵喵喵~~~");
    }
    public void skill(){
        System.out.println(this.name + "抓老鼠！");
    }
}
====================================================
class Dog{

    public String name;
    public String sex;
    public int age;
    public float weight;

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
    public void sleep(){
        System.out.println(this.name + "正在睡觉");
    }
    public void mew(){
        System.out.println(this.name + "汪汪汪~~");
    }
    public void skill(){
        System.out.println(this.name + "护家！");
    }
=====================================================
 */





//抽取猫和狗的共性构成一个新类 ---- 对共性进行抽取，实现代码的复用
class Animal {
    public String name;
    public String sex;
    public int age;
    public float weight;

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
    public void sleep()
    {
        System.out.println(this.name + "正在睡觉");
    }
}



class Cat extends Animal{

    public void mew(){
        System.out.println(this.name + "喵喵喵~~~");
    }
    public void skill(){
        System.out.println(this.name + "抓老鼠！");
    }
}




class Dog extends Animal{


    public void mew(){
        System.out.println(this.name + "汪汪汪~~");
    }
    public void skill(){
        System.out.println(this.name + "护家！");
    }
}











public class InherAndPoly {
    //继承和多态


    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 5;
        cat1.sex = "公";
        cat1.weight = 34.5f;
        cat1.mew();
        cat1.eat();
        cat1.sleep();
        cat1.skill();


    }


}
