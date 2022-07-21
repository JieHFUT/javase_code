import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 19:04
 */
public class practice_03 {
    public static void main(String[] args) {
        //不限制输入数组的长度
        System.out.println("请输入几个数字并且用逗号隔开！");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();//定义一个字符str在输入数后面
        String[] array1 = str.split(",");//存放逗号
        int[] array2 = new int[array1.length];//int数组，长度为字符串数组的长度，用于控制数组长度
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(array1[i]);//录入数据到数组
            System.out.print(array2[i] + " ");
        }
        System.out.println();


        //限制输入数字的个数
        System.out.println("请输入三个数字：");
        int[] array3 = new int[3];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array3));

    }
}
