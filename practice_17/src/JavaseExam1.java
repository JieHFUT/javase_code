/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 5:55
 */


import java.util.Scanner;

/**
 * 输入一个字符串，求出该字符串的字符集合，按照字母的顺序输出
 * 数据范围：输入的字符串长度满足1-100，且只包含大小写字母，区分大小写
 * 每组数据输出一行，按照字符串原有的字符顺序输出，重复出现并且靠后的字母不输出
 * absdefFfghhu -> absdefFghu
 */



public class JavaseExam1 {

    public static void printOrder(String str){
        int lenth = str.length();
        char[] chars = new char[lenth];
        for (int i = 0; i < lenth; i++) {
            chars[i] = str.charAt(i);
        }
        int count = 0;
        char[] chars1 = new char[lenth];
        for (int i = 0; i < lenth; i++) {
            count = 0;
            for (int j = 0; j < lenth; j++) {
                if(chars[i] == chars1[j]){
                    count++;
                }
            }
            if(count == 0){
                chars1[i] = chars[i];
            }
        }
        for (int i = 0; i < lenth; i++) {
            if(chars1[i] != '\u0000'){
                System.out.print(chars1[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = new String();
        while (scanner.hasNextLine()) {
            str = scanner.nextLine();
            printOrder(str);
        }
    }
}
