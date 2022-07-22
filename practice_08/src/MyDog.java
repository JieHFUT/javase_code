import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 15:06
 */
public class MyDog {

    String name;
    int age;
    String colour;

    public MyDog(){
        this.name = "洋洋";
        this.age = 20;
        this.colour = "黑色";
    }

    public MyDog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    public void show(){
        System.out.println("名字："+name+" 年龄："+age+" 颜色："+colour);
    }

    @Override
    public String toString() {
        return "MyDog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("======================类的调用者=======================");
        MyDog myDog1 = new MyDog();
        myDog1.show();

        MyDog myDog2 = new MyDog("大黄",12,"桔黄色");
        myDog2.show();

        //如果一个类里面没有toString方法，那么就默认正常的toString方法，例如下面生成地址值
        //如果重写了toString方法，那么打印的时候就会调用自己写的toString方法

        MyDog myDog3 = new MyDog();
        //没有重写的时候：System.out.println(myDog3); ------------- MyDog@1b6d3586

        //重写之后
        System.out.println(myDog3);//MyDog{name='洋洋', age=20, colour='黑色'}


    }
}
