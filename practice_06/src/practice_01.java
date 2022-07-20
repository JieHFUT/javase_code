/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-20
 * Time: 16:46
 */
public class practice_01 {
    public static void main(String[] args) {
        //数组的学习
        //中括号当中不能有任何的数字
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(array1.length);
        System.out.println(array1[10]);//ArrayIndexOutOfBoundsException----与c不同，不允许数组越界


        //动态初始化
        int[] array3 = new int[10];//没有初始化的数组，默认全部都是 -> 0/null/false
        array3[1] = 10;

        //简写只有一次机会赋值机会
        int array4[];
        array4 = new int[]{1,2,3,4,5};
        array4 = new int[]{5,6,7,8,9};

        int[] array5 = {1,2,3,4,5};
        //array5 = {2,3,4,5,6}; ------- 报错



    }
}
