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



        //intern方法














    }




}
