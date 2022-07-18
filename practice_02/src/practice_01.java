/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-18
 * Time: 9:10
 */
public class practice_01 {
    public static void main(String[] args) {
        //位运算符

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
