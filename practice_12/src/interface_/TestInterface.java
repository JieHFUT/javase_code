package interface_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 15:33
 */


/**
 * 1、一个类可以继承抽象类，同时实现多个接口。每个接口之间使用逗号来分割
 * 2、class Dog extends Animal implements IRuning,ISwinmming{}；
 * 3、
 *
 */



class Animal{
    public String name;
    public int age;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(this.name + " is eating!");
    }
}








//飞
interface IFlying{
    public abstract void fly();
}
//跑
interface IRuning{
    public abstract void run();
}
//游泳
interface ISwinmming{
    public abstract void swim();
}











class Dog extends Animal implements IRuning,ISwinmming{

    public Dog(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "这只狗正在奔跑！");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "这只狗正在游泳！");
    }
}






class Cat extends Animal implements IRuning{
    public Cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "这只猫正在奔跑！");
    }
}









public class TestInterface {

    public static void run(IRuning iRuning){
        iRuning.run();
    }


    public static void main(String[] args) {

        Animal animal1 = new Dog("旺财");
        Animal animal2 = new Cat("咪咪");

        IRuning iRuning1 = new Dog("旺财");
        ISwinmming iSwinmming1 = new Dog("旺财");

        IRuning iRuning2 = new Cat("咪咪");

        run(iRuning1);
        run(iRuning2);

        iRuning1.run();
        iRuning2.run();

    }
}
