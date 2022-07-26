package object;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 20:34
 */

//object类是所有类的父类，就算没写也会默认继承object类

class Teacher{

    public String name;
    public int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//代表两个引用引用同一个对象
        if (o == null || getClass() != o.getClass()) //两个类型都不一样的时候；getclass获取引用类型
            return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}










interface Ishape {
    void func();
}




class Draw implements Ishape{

    @Override
    public void func() {
        System.out.println("这是接口重写的方法！");
    }
}




public class Obj {

    public static void main(String[] args) {

        Object object1 = new Teacher("Wangrenjie",22);

        Teacher teacher1 = new Teacher("张三",29);
        Teacher teacher2 = new Teacher("李四",39);
        Teacher teacher3 = new Teacher("张三",29);

        System.out.println(teacher1.equals(teacher2));//false
        System.out.println(teacher1.equals(teacher3));//true
        //总的来说，equals就是判断两个引用内容是不是一样

        System.out.println(teacher1.hashCode());
        System.out.println(teacher3.hashCode());
        //hashCode用来计算一个对象在逻辑上的位置



        //Object接收数组对象，向上转型
        Object obj1 = new int[]{1,2,3,4,5,6};
        //向下转型，需要强转
        int[] data = (int[])obj1;
        for (int i:
             data) {
            System.out.print(i + " ");
        }



        //把接口给Obiect
        Ishape ishape1 = new Draw();
        Object obj2 = ishape1;

        Ishape ishape2 = (Ishape) obj2;
        ishape2.func();





    }

}
