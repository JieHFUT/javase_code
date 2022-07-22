/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 15:50
 */

public class Encapsulation1 {
    //在方法当中定义的变量是局部变量，而静态的变量属于类变量。随着类的加载而被创建
    //而局部变量是调用该方法的时候，才创建的。
    static boolean flg;
    public String name;
    public int age;

    private double high; //只能在这个类里面使用
    private String hiarColour;
    int teethNumber;//包访问权限 --- default
    //若有就地初始化，初始化的值会放在构造方法里面

    //构造方法
    public Encapsulation1(){
        //this("wangrenjie",22);
        //System.out.println("这是一个不带参数的构造方法！");
    }

    public Encapsulation1(String name, int age) {
        System.out.println("这是一个带两个参数的构造方法！");
        this.name = name;
        this.age = age;
    }


    //setter and getter

    public String getHiarColour() {
        return hiarColour;
    }

    public void setHiarColour(String hiarColour) {
        this.hiarColour = hiarColour;
    }

    @Override //可以理解为一种注解 ---- 重写（覆写）
    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sleep(){
        //谁调用这个方法。this存储的就是谁的地址
        //方法里面的变量存储在栈中
        System.out.println(this.name + "正在睡觉！");
    }

    public void sleep2(){
        this.sleep();
    }

    public static void main(String[] args) {

        System.out.println(flg);

        Encapsulation1 encapsulation1 = new Encapsulation1();
        encapsulation1.name = "alice";
        encapsulation1.sleep();

        System.out.println(encapsulation1);
    }



}


