package protect2;

import protect1.Protected1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-23
 * Time: 23:05
 */
public class Protected2 extends Protected1 {

    //Protected访问权限(继承权限) ---- 在成员方法中通过super关键字来进行访问
    public void func1(){
        super.k = 10;
    }

    public void func2(){
        Protected1 protected1 = new Protected1();
        super.k = 20;
    }






    public static void main(String[] args) {




    }

}
