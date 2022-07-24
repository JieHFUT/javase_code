package three_usual_interface_1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 17:09
 */


class Student implements Comparable<Student> {
    String name;
    int age;
    double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        } else if (this.age == o.age) {
            return 0;
        }else {
            return -1;
        }
        //return 0;


        //如果是字符串进行比较，那么就需要调用String类里面覆盖的compareTo方法
        /**
         * if（this.name.compareTo(o.name)）{
         *      return 1;
         * } else if(**********) {
         *      return 0;
         * } else {
         *      return -1;
         * }
         *
         * 其实可以直接返回 return this.name.compareTo(o.name);
         */


        //return this.age-o.age ---------- 从小到大
        //return o.age-this.age ---------- 从大到小
        //return (int)(this,score-o.score)


    }
}





public class Test1 {

    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("张三",23,43.54);
        student[1] = new Student("李四",45,76.28);
        student[2] = new Student("王五",32,99.34);

        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

        System.out.println(student[0].compareTo(student[1]));//-1




    }



    public static void main1(String[] args) {

        int[] array = {1,21,4,15,6,17};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[1, 4, 6, 15, 17, 21]

    }



}
