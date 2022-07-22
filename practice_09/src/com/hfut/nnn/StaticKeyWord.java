package com.hfut.nnn;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 1:59
 */
public class StaticKeyWord {




    public static void main(String[] args) {
        Student student1 = new Student("张三",13,56.5);
        Student student2 = new Student("李四",16,76.5);

        Student.classes = "信管20-1班";
        System.out.println(student1);
        System.out.println("==============================");
        System.out.println(student2);

        Student student3 = null;
        System.out.println(student3.classes);//信管20-1班

    }
}
