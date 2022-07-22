package com.hfut.www;

import com.hfut.mmm.One;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 1:17
 */
public class Two {


    public static void main(String[] args) {

        One one = new One();
        //System.out.println(one.a); --- a在com.hfut.mmm.One中不是公共的; 无法从外部程序包中对其进行访问
        System.out.println(one.b);


    }


}
