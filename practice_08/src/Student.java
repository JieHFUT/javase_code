/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 23:56
 */
public class Student {
    public String name;
    public String gender;
    public short age;
    public double score;

    public void show(){
        System.out.println("姓名："+name+" 性别："+gender+" 年龄："+age+" 分数："+score);
    }
    public void doClass(){
        System.out.println(name + "正在上课！！");
    }

    public void doHomework(){
        System.out.println(name + "正在写作业！");
    }
    public void Exam(){}

    public static void main(String[] args) {
        Student student1 = new Student();//student1既是一个局部变量，也是一个引用变量
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = null;

        student1.age = 19;
        student1.gender = "男";
        student1.name = "王仁杰";
        student1.doClass();
        student1.doHomework();
        student1.show();
        System.out.println("===========================================");


        student2.age = 29;
        student2.gender = "男";
        student2.name = "吴迪";
        student2.doClass();
        student2.doHomework();
        student2.show();
        System.out.println("===========================================");


        student3.show();//姓名：null 性别：null 年龄：0 分数：0.0
        //当成员变量没有给赋初值的时候，每个成员变量都是其所对应的“0”值
        //0    0.0    null    false    char对应的是unicode对应的“\u0000" ----> 即为空格




    }
}
