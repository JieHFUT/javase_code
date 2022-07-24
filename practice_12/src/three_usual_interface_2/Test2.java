package three_usual_interface_2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 19:43
 */



class Teacher{
    public String name;
    public int age;
    public double score;

    public Teacher(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}




//比较器





public class Test2 {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("语文老师",34,34.32);
        Teacher teacher2 = new Teacher("数学老师",47,98.34);

    }



}
