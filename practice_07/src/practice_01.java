import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 19:39
 */
public class practice_01 {


    public static void main(String[] args) {
        //数组
        int[] array1 = {1,2,3,4};
        int[] array2 = array1;
        int[] array3 = null;

        int[] array4 = {1,2,3,4,5,6,7,8};
        //copyOfRange ------- 拷贝一部分，返回值int[]
        int[] ret =  Arrays.copyOfRange(array4,1,3);  //左闭右开 ---- [2, 3]
        System.out.println(Arrays.toString(ret));

        //Arrays.sort(array); ---------------- 默认升序
        //Arrays.binarySearch(); ------------- 返回下标，没有返回负数（返回最后一次left加一）
        System.out.println(Arrays.binarySearch(array4, 16));

        boolean flg = Arrays.equals(array1,array4);

        int[] array5 = new int[10];
        System.out.println("填充之前：" + Arrays.toString(array5));//填充之前：[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        Arrays.fill(array5,1);
        System.out.println("填充之后：" + Arrays.toString(array5));//填充之后：[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]


        int[] array6 = new int[10];
        Arrays.fill(array6,2,5,1);
        System.out.println("选择填充：" + Arrays.toString(array6));//选择填充：[0, 0, 1, 1, 1, 0, 0, 0, 0, 0]



    }
}
