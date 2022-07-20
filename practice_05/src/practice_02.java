/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-20
 * Time: 16:13
 */
public class practice_02 {
    //无效交换
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static float add(float a, float b){
        return a + b;//a,b形参
    }
    public static double add(double a, double b){
        return a + b;//a,b形参
    }
    public static int add(int a, int b){
        return a + b;//a,b形参
    }
    public static int add(byte a, byte b){
        return a + b;//a,b形参
    }
    public static void main(String[] args) {
        //实参和形参的关系
        //形参是实参的一个拷贝
        int x = 10;
        int y = 20;
        int ret = add(x,y);
        System.out.println(ret);//x,y实参

        //方法的重载
        //方法名相同
        //参数列表不同（个数、顺序、类型）
        //返回值不做要求

        byte b1 = 12;
        byte b2 = 13;
        //byte b3 = b1 + b2; ----- 这样会报错，byte在运算的时候会提升到4个字节
        int b3 = b1 + b2;
    }
}
