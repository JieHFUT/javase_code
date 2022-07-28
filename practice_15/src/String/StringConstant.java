package String;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-28
 * Time: 3:04
 */

public class StringConstant {
    //常量池


    public static void main(String[] args) {
        //字符串的修改
        String str1 = "hello";
        str1 += " world";
        System.out.println(str1);
    }






    public static void main2(String[] args) {
        //字符串的不可变
        String str1 = "hello";

        //被final修饰的引用其指向不能被改变，但是可以修改里面的内容
        final int[] array1 = {1,2,3};
        //array1 = new int[]{2,3,4};
        array1[1] = 8;

    }





    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false


        String str4 = "world";



        String str5 = "he"+"llo";
        System.out.println(str1 == str5);//true

        String str6 = "he";
        String str7 = "llo";
        String str8 = str6 + str7;//str2 and str3是变量，在编译的时候还不知道里面存的是谁
        System.out.println(str1 == str8);//false



        //intern方法 ---- 将其所指向的对象放到常量池当中
        char[] ch1 = new char[]{'a','b','c'};
        String  str9 = new String(ch1);

//        String str10 = "abc";
//        System.out.println(str9 == str10);//false

        str9.intern();//手动入池
        String str11 = "abc";
        System.out.println(str11 == str9);//true

    }




}
