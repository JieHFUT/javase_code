import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 16:44
 */
public class practice_02 {
    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外
     * 其余每个元素均出现两次。找出那个只出现了一次的元素。
     */
    public static void findOneTime(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("只出现一次的数字是：" + array[i]);
                return;
            }
        }
        System.out.println("没有只出现一次的数据！");
        return;
    }
    /**
     * 给定一个整型数组, 实现冒泡排序(升序排序)
     */
    public static int[] bubbleSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[j + 1]){
                    int tmp = array[j +1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
    /**
     * 给定一个整型数组, 判定数组是否有序（递增）
     */
    public static boolean judgeOrder(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    /**
     * 给定一个(有序)整型数组, 实现二分查找
     */
    public static void binarySearch(int[] array,int target){
//        for (int i = 1; i < array.length; i++) {
//            for (int j = 0; j < array.length - i; j++) {
//                if(array[j] > array[j + 1]){
//                    int tmp = array[j +1];
//                    array[j + 1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        while(left < right){
            if(array[mid] == target){
                System.out.println("找到目标值："+ array[mid] + "; " +  " 下标值是：" + mid);
                return;
            } else if (array[mid] > target) {
                right = mid;
                mid = (right + left) / 2;
            }else {
                left = mid;
                mid = (right + left) / 2;
            }
        }
        if(left >= right){
            System.out.println("没有找到目标值！");
            return;
        }
    }
    /**
     * 实现一个方法 toString, 把一个整型数组转换成字符串.
     * 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
     */
    public static String myToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str += array[i];
            }else {
                str += array[i] + ", ";
            }
        }
        str += "]";
        return str;
    }
    /**
     * 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
     */
    public static int[]  copyOf(int[] array, int[] copy){
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
    /**
     * 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
     */
    public static void setArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
    /**
     * 实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
     */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    /**
     * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素
     * 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
     */
    public static void transform(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * array[i];
        }
    }
    /**
     * 实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
     */
    public static double sum(double[] array){
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    /**
     * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
     * @param array
     * @return
     */
    public static double avg(double[] array){
        double sum = 0.0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            sum += array[i];
        }
        return sum / len;
    }
    public static void main(String[] args) {
        double[] array1 = {1.2,2.3,4.56,2.345,3.23,2.5,5.76};
        double ret1  = avg(array1);
        System.out.println(String.format("%.2f",ret1));

        double[] array2 = {1.2,2.3,4.56,2.345,3.23,2.5,5.76};
        double ret2 = sum(array2);
        System.out.println(String.format("%.2f",ret2));

        int[] array3 = {1,2,3,4,5,6};
        transform(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {1,2,3,4,5,6};
        printArray(array4);

        int[] array5 = new int[100];
        setArray(array5);
        System.out.println(Arrays.toString(array5));

        int[] array6 = {2,3,4,5,6,7,8,9};
        int[] array7 = new int[array6.length];
        copyOf(array6,array7);
        System.out.println(Arrays.toString(array7));

        int[] array8 = {3,4,5,56,67,78};
        String str1 = myToString(array8);
        System.out.println(str1);

        int target = 7;
        int[] array9 = new int[]{1,2,3,4,5,6,7,8,9,10};
        binarySearch(array9,target);

        int[] array10 = {1,2,3,4,5,7,6,8,9};
        boolean flg = judgeOrder(array10);
        if(flg){
            System.out.println("该数组有序！");
        }else {
            System.out.println("该数组无序！");
        }

        int[] array11 = {4,5,7,9,1,2,34,56,78,32,4,6,88,4,3212,456};
        int[] array12 = bubbleSort(array11);
        System.out.println(Arrays.toString(array12));

        int[] array13 = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,8,9,9};
        findOneTime(array13);
    }
}
