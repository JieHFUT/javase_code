package three_usual_interface_2;

import java.util.Arrays;
import java.util.Comparator;

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
class AgeComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.age-o2.age;
    }
}

class NameComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.name.compareTo(o2.name);
    }
}

class ScoreComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return (int) (o1.score- o2.score);
    }
}

















public class Test2 {

    public static void main(String[] args) {

        Teacher[] teachers = new Teacher[3];
        teachers[0] = new Teacher("语文老师",34,34.32);
        teachers[1] = new Teacher("数学老师",47,98.34);
        teachers[2] = new Teacher("政治老师",67,23.32);

        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(teachers, ageComparator);
        System.out.println(Arrays.toString(teachers));


        ScoreComparator scoreComparator = new ScoreComparator();
        Arrays.sort(teachers,scoreComparator);
        System.out.println(Arrays.toString(teachers));


        NameComparator nameComparator = new NameComparator();
        Arrays.sort(teachers,nameComparator);
        System.out.println(Arrays.toString(teachers));



    }



}
