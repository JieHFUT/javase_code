/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-18
 * Time: 9:10
 */
public class practice_01 {
    public static void main(String[] args) {
        //运算符的优先级等
    }
    public static void main8(String[] args) {
        //条件运算符：表达式1？表达式2：表达式3-------必须是布尔表达式
        //由于有返回值，所以需要去接收它
        int a = 10;
        int b = 20;
        int c = a>b?a:b;
    }
    public static void main7(String[] args) {
        //移位运算符：< >
        //右移的时候，正数补0，负数补1
        //>>> 无符号右移，不管你是正数还是负数，统统补0（没有无符号左移）
        System.out.println(-9>>2);//-3
        System.out.println(-27>>3);//-4
        System.out.println(-45>>2);//-12
        //负数右移的时候要向上（小）取整
    }
    public static void main6(String[] args) {
        //位运算符：& | ~ ^
        int a = 0x0000000f;
        System.out.println(~a);//-16----fffffff0
    }
    public static void main5(String[] args) {
        //&& || !
        //布尔表达式 && 布尔表达式
        //短路与:&&，在前面的布尔表达式为假的时候，就不会判断后面的布尔表达式
        //短路或:||，在前面的布尔表达式为真的时候，就不会判断后面的布尔表达式
        //只使用&或者|的时候，如果表达式两边结果为布尔类型的时候，也表示逻辑运算；但不会产生短路问题，两个表达式都会执行
        //如果&或者|左右两边不是布尔表达式的话，就会为位运算
    }
    public static void main4(String[] args) {
        //== != <= >=
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false
        System.out.println(a != b);//true
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true

    }
    public static void main3(String[] args) {
        //++ --
        int a = 10;
        int b = ++a;
        int c = a++;
        System.out.println(b);
        System.out.println(c);
    }
    public static void main2(String[] args) {
        //+= -= *= /=
        int a = 99;
        short s = 0;

        s = (short)(s + a);
        System.out.println(s);
        s += a;//增量运算符会自动转换
    }
    public static void main1(String[] args) {
        System.out.println(10 % 3);//1
        System.out.println(11.5 % 2.0);//1.5
        System.out.println(10 % 3);//1
        System.out.println(10 % -3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(-10 % -3);//-1

    }
}
