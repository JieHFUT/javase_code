/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 15:27
 */
public class Encapsulation {
    //封装
    /**
     * public ---- 公共的，公开的
     * private --- 私有的，不公开 ----- 被private修饰的字段或者方法只能在当前类当中使用
     *                                把这些属性封装在了这个类当中，比较安全
     *                                对于类的调用者来说，只需要去找这些公开的接口即可
     */






    //字段
    private String name;
    private int age;
    private String colour;

    public Encapsulation(){
        this.name = "洋洋";
        this.age = 20;
        this.colour = "黑色";
    }

    public Encapsulation(String name, int age, String colour) {
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
    //一些公开的接口
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("吴迪");
        String name1 = encapsulation.getName();
        System.out.println(name1);

    }

}
