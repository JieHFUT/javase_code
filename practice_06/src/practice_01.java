import java.util.Arrays;

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
        //System.out.println(array1[10]); ---- ArrayIndexOutOfBoundsException----与c不同，不允许数组越界


        //动态初始化
        int[] array3 = new int[10];//没有初始化的数组，默认全部都是 -> 0/null/false
        array3[1] = 10;

        //简写只有一次机会赋值机会
        int array4[];
        array4 = new int[]{1,2,3,4,5};
        array4 = new int[]{5,6,7,8,9};

        int[] array5 = {1,2,3,4,5};
        //array5 = {2,3,4,5,6}; ------- 报错

        //遍历数组
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //for-each ---- 增强for循环
        for (int x :
             array1) {
            System.out.print(x +" ");
        }
        System.out.println();

        //借助Java本身提供的一些方法来实现数组的打印 --- Arrays类(帮助操作数组) - 可帮助手册--学习
        //toString把参数的数组转换为字符串进行输出，返回值是String
        String str1 = Arrays.toString(array1);
        System.out.println(str1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //数组的底层
        //.java文件--->编译javac----->字节码文件.class (JVM上运行)
    }
}
