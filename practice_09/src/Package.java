import java.util.Arrays;
import static java.lang.Math.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 0:10
 */
public class Package {
    /**
     * import java.util.Arrays;    Arrays类
     * import java.util.*;         导入该包的全部类，但是使用的时候才会创建
     */
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(array));


        //另外一种方式
        java.util.Date data = new java.util.Date();
        long ret = data.getTime();
        System.out.println(ret);//1658506807765 ------ 获取时间戳


        //静态导入
        //double result = Math.sqrt(Math.pow(3,2) + Math.pow(4,2));
        double result = sqrt(pow(3,2) + pow(4,2));

        //创建包 - 设置(齿轮) -  Tree apperance - compact middeld packages


        //package com.hfut.www; -------- 声明包的路径

    }
}
