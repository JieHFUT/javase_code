import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-28
 * Time: 19:15
 */


public class LearnString {


    public static boolean judge(String str){
        int lenth = str.length();
        char[] chars = new char[36];
        for (int i = 0; i < lenth; i++) {
            char ch = str.charAt(i);
            if('a' < ch && ch < 'z' || 0 < ch && ch < 9){
                chars[i] = ch;
            }
        }
        int count = 0;
        int lenth2 = chars.length;
        for (int i = 0; i < lenth2/2; i++) {
            if(chars[i] != chars[lenth2-i-1]){
                count++;
            }
        }
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        //判断回文，忽略空格和大小写,只考虑数字字符和字母
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串用来判断其是否是回文：");
        String string = scanner.nextLine();
        String str = string.toLowerCase();
        boolean flg = judge(str);
        System.out.println(flg);
    }


    public static void main4(String[] args) {
        //最后一个单词的长度 如：Hello Nowcoder
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String string = scanner.nextLine();
            int index = string.lastIndexOf(" ");
            String ret = string.substring(index + 1);
            System.out.println(ret);
        }

    }
    public static void main3(String[] args) {
        //最后一个单词的长度 如：Hello Nowcoder
        String str = new String("helljqw dqwd cert vewrcrew");
        str.trim();
        String[] strings = str.split(" ");
        int lenth = strings.length;
        System.out.println(strings[lenth-1]);
    }

    public static void main2(String[] args) {
        String str = "abc";
        String str2 = "def";
        String str3 = str + str2;


        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder);//abc0123456789


    }


    public static void main1(String[] args) {
        //StringBuffer ---------- 线程安全
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);//hello

        //逆置字符串
        stringBuffer.reverse();
        System.out.println(stringBuffer);//olleh

        //偏移为多少的位置插入字符串
        stringBuffer.insert(0,"ff");
        System.out.println(stringBuffer);//ffolleh


        //添加字符串接在后面
        stringBuffer.append("!!");
        System.out.println(stringBuffer);//ffolleh!!


        //StringBulider -------- 线程不安全
        StringBuilder stringBuilder = new StringBuilder();


    }
}
