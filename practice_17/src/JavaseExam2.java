import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-29
 * Time: 7:08
 */
public class JavaseExam2 {

    public static String func(String str){
        int[] array = new int[127];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(array[ch] == 0){
                stringBuilder.append(ch);
                array[ch] = 1;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String ret = func(str);
            System.out.println(ret);
        }
    }




}
