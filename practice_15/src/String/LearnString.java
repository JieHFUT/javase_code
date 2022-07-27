package String;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 20:00
 */


public class LearnString {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");//其中一种构造方法
        char[] chars = {'a','b','c','d'};
        String str3 = new String(chars);
        System.out.println(str3);//abcd --- String重写了toString


        //java里面没有所谓的/0代表字符串的结尾
        System.out.println(str1.length());//获取字符串长度方法


        //String类重写了object的equals方法
        System.out.println(str1.equals(str2));//

        //比较两个字符串的大小
        System.out.println(str1.compareTo(str2));//0

        //忽略字符串的大小写进行比较
        System.out.println(str1.equalsIgnoreCase(str2));

        //两个字符相减
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println(ch1-ch2);









        String s = "aaabbbcccaaabbbccc";

        //返回index位置上字符，如果index为负数或者越界，抛出
        //IndexOutOfBoundsException异常
        System.out.println(s.charAt(3)); // 'b'

        //返回ch第一次出现的位置，没有返回-1
        System.out.println(s.indexOf('c')); // 6

        //从fromIndex位置开始找ch第一次出现的位置，没有返回-1
        System.out.println(s.indexOf('c', 10)); // 15

        //返回str第一次出现的位置，没有返回-1
        System.out.println(s.indexOf("bbb")); // 3

        //从fromIndex位置开始找str第一次出现的位置，没有返回-1
        System.out.println(s.indexOf("bbb", 10)); // 12

        //从后往前找，返回ch第一次出现的位置，没有返回-1
        System.out.println(s.lastIndexOf('c')); // 17

        //从fromIndex位置开始找，从后往前找ch第一次出现的位置，没有返回-1
        System.out.println(s.lastIndexOf('c', 10)); // 8

        //从后往前找，返回str第一次出现的位置，没有返回-1
        System.out.println(s.lastIndexOf("bbb")); // 12

        //从fromIndex位置开始找，从后往前找str第一次出现的位置，没有返回-1
        System.out.println(s.lastIndexOf("bbb", 10)); // 3


        /**
         * 字符串的转化
         * 1、整数转字符串
         * 2、大小写转化
         * 3、字符串转数组
         * 4、格式化
         */

        //数字转字符串
        int a = 101;
        String str4 = String.valueOf(a);//101以字符串的形式

        //字符串转整数
        String str5 = "123";
        int ret1 = Integer.valueOf(str5);
        System.out.println(ret1 + 1);//124


        int ret2 = Integer.parseInt(str5);
        System.out.println(ret2 + 1);//124

        double ret3 = Double.parseDouble(str5);
        System.out.println(ret3 + 1);//124.0


        //大小写转换
        /**
         * 变成大写并不是在其本身上直接变成大写，而是一个新的对象
         */
        String str6 = "hEllo";
        String str7 = str6.toUpperCase();
        System.out.println(str7);//HELLO


        String str8 = "HEllo";
        String str9 = str8.toLowerCase();
        System.out.println(str9);//hello



        //字符串转数组
        String str10 = "hello";
        char[] ch3 = str10.toCharArray();
        System.out.println(Arrays.toString(ch3));//[h, e, l, l, o]



        //格式化的形式 - 转变为字符串
        String str11 = String.format("%d-%d-%d", 2019, 9,14);
        System.out.println(str11);//2019-9-14





        /**
         * 字符串的替换
         */

        String str12 = "abcabcabcaaaaa";

        //单字符替换
        String str13 = str12.replace('a','m');
        System.out.println(str13);//mbcmbcmbcmmmmm

        //字符串替换
        String str14 = str12.replace("ab","mm");
        System.out.println(str14);//mmcmmcmmcaaaaa

        //只替换第一个字符串
        String str15 = str12.replaceFirst("ab","mm");
        System.out.println(str15);//mmcabcabcaaaaa





        /**
         * 字符串的拆分
         */
        String str16 = "abc def jdhf";
        //如果想要以空格进行堆字符串进行拆分
        String[] strings1 = str16.split(" ");
        for (String st1:
             strings1) {
            System.out.println(st1);
        }

        //需要转移的字符
        String str17 = "abc.sr.ewr.rtger.qwe";
        String[] strings2 = str17.split("\\.");
        for (String st2:
             strings2) {
            System.out.println(st2);
        }

        //拆分并且定拆分的组数
        String[] strings3 = str17.split("\\.",2);
        for (String st3:
                strings3) {
            System.out.println(st3);
        }

        //多种分割定位符用|隔开
        String str18 = "abc csd@ftfdxqf";
        String[] strings4 = str18.split(" |@");
        for (String st4:
             strings4) {
            System.out.println(st4);
        }



        //多次拆分
        String str19 = "name=wangrenjie age=22";
        String[] strings5 = str19.split(" ");
        for (String st5:
             strings5) {
            String[] strings6 = st5.split("=");
            for (String st6:
                 strings6) {
                System.out.println(st6);
            }
        }


        /**
         * 字符串的截取
         */
        String str20 = "abcdefg";
        String ret4 = str20.substring(3);
        System.out.println(ret4);//defg
        String ret5 = str20.substring(3,4);
        System.out.println(ret5);//d




        /**
         * String trim() 去掉字符串中的左右空格,保留中间空格
         * String toUpperCase() 字符串转大写
         * String toLowerCase() 字符串转小写
         */

        String str21 = "  sfwe ewfwrg qwrf  ";
        String str22 = str21.trim();
        System.out.println(str22);//sfwe ewfwrg qwrf




















    }

}
