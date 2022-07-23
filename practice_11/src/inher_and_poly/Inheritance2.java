package inher_and_poly;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 22:02
 */

class Animal {
    private String name;
    private int age;
    public float weight;


    static{
        System.out.println("这是Animal的静态代码块！");
    }
    {
        System.out.println("这是Animal的实例代码块！");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //父类里面的构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("这是Animal带两个参数的构造方法！");
    }
    public Animal(){
        System.out.println("这是Animal带零个参数的构造方法！");
    }

    public void eat(){
        System.out.println(this.name + "正在吃饭");
    }
    public void sleep()
    {
        System.out.println(this.name + "正在睡觉");
    }
}


/**
 *
 * 1、当构造子类的时候，一定要先帮助父类进行构造
 * 2、如果父类没有构造方法，编译器会默认给父类提供一个不带参数的构造方法
 *    子类的构造方法里面会默认有一个super();
 *
 */







class Cat extends Animal{

    public String fur;


    static{
        System.out.println("这是Cat的静态代码块！");
    }
    {
        System.out.println("这是Cat的实例代码块！");
    }


    //子类的构造方法
    public Cat(){
        super();
        System.out.println("这是Cat带零个参数的构造方法！");
    }
    public Cat(String name,int age, String fur){
        super(name,age);
        //显示调用父类的构造方法，来初始化----子类从父类继承过来的东西
        this.fur = fur;
        System.out.println("这是Cat带三个参数的构造方法！");
    }

    public void mew(){
        System.out.println(this.getName() + "喵喵喵~~~");
        //子类不能访问父类中被private的成员
    }
    public void skill(){
        System.out.println(this.getName() + "抓老鼠！");
    }


}












public class Inheritance2 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("huahua",4,"black");
//        cat1.setName("mimi");
//        cat1.setAge(5);
//        cat1.mew();
//        cat1.eat();

        System.out.println("=================================");
        Cat cat2 = new Cat("meimei",5,"red");

    }
}
