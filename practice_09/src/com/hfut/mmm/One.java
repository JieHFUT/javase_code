package com.hfut.mmm;

import com.hfut.www.Two;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 1:20
 */

public class One {

    int a = 199;//default - 包访问权限（默认权限）
    public int b = 299;

    private int c = 399;






    public static void main(String[] args) {
        Two two = new Two();

        //如何调用src下面的类 - 如Package类
        //Package package  = new Package(); ------ java: 不是语句(报错)

        One one = new One();
        System.out.println(one.a);


    }
}
