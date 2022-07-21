import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-21
 * Time: 22:21
 */
public class practice_02 {
    public static void main(String[] args) {
        //二维数组
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] x:
             array1) {
            System.out.println(x);//输出array1.length个地址
        }
        //使用for-each来打印二维数组
        for (int[] x:
             array1) {
            for (int y:
                 x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        //使用toString来打印二维数组
        System.out.println(Arrays.toString(array1));//[[I@1b6d3586, [I@4554617c]

        //不规则二维数组
        //java里面数组的列可以不写 -------- 各列可以重新赋值
        int[][] array4 = new int[2][];
        array4[0] = new int[2];
        array4[1] = new int[4];
    }
}
