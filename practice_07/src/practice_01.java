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
        //数组 + 类
        int[] array1 = {1,2,3,4};
        int[] array2 = array1;
        int[] array3 = null;

        int[] array4 = {1,2,3,4,5,6,7,8};
        //copyOfRange ------- 拷贝一部分，返回值int[]
        int[] ret =  Arrays.copyOfRange(array4,1,3);  //左闭右开 ---- [2, 3]
        System.out.println(Arrays.toString(ret));


    }
}
