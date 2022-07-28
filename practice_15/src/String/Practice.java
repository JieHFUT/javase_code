package String;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-28
 * Time: 16:00
 */

public class Practice {

    //第一个只出现一次的字符
    public static char findTheFirst(String str){

        //对参数进行判断
        if(str == null || str.length() == 0){
            return ' ';
        }
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            array[ch1 - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch2 = str.charAt(i);
            if(array[ch2 - 'a'] == 1){
                return ch2;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String str1 = "qwefhdiuwqeg";
        char ch1 = findTheFirst(str1);
        System.out.println(ch1);
    }

}
