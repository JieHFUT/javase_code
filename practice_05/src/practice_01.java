import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-19
 * Time: 14:20
 */
public class practice_01 {
    //输出一个数的二进制中的奇数二进制、偶数二进制
    public static void printOddEve(int n){
        int i = 0;
        for(i = 31; i >= 1; i -= 2){
            System.out.print((n >> i) & 1);
        }
        System.out.println();
        for(i = 30; i >= 0; i -= 2){
            System.out.print((n >> i) & 1);
        }
    }
    //给一个正整数N；判断这个数字是不是2的K次方！不用求解K是多少。
    public static boolean judgeNumber(int n){
       if((n & (n-1)) == 0){
           return true;
       }
       return false;
    }
    public static int countTheNumbertOfOne3(int n){
        int count = 0;
        while(n != 0){
            n  = n & (n-1);
            count++;
        }
        return count;
    }
    public static int countTheNumbertOfOne2(int n){
        //不一定都需要移动32次
        int count = 0;
        if(n != 0){
            for(int i = 0; i < 32; i++){
                if(((n >>> i)&1) == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int countTheNumberOfOne1(int n){
        //无论结果如何，都需要移动32次
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1) == 1){
                count++;
            }
        }
        return count;
    }
    //Math.sqrt();  Math.pow();  进入Math类 alt+7
    public static void perfectNumber(){
        //找完全数
        //求位数
        for(int i = 0; i <= 10_000_000; i++){
            int j = i;
            int count = 0;
            while(i != 0){
                i = i / 10;
                count++;
            }
            //求次幂和
            i = j;
            int sum = 0;
            for(int k = 1; k <= count; k++){
                sum += Math.pow(j % 10, count);
                j = j / 10;
            }
            if(i == sum){
                System.out.println(i);
            }
        }
    }
    /**
     *
     * @param year 年份
     * @return 是否是闰年，是---返回true；不是---返回false
     */
    public static boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println(year + " is leap year!");
            return true;
        }else{
            System.out.println(year + " is common year!");
            return false;
        }
    }
    public static  int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        //方法 public static 返回值类型 方法名（形式参数列表）{方法体}；
        //方法必须写在类里面，而且方法不能嵌套定义
        int ret = add(10,20);
        System.out.println(ret);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year  = scanner.nextInt();
        boolean flg = isLeapYear(year);

        //perfectNumber();

        System.out.println("请输入您要输入的数字：");
        int num1 = scanner.nextInt();
        int count1 = countTheNumberOfOne1(num1);
        System.out.println("该数的二进制中1的个数为：" + count1);

        System.out.println("请输入您要输入的数字：");
        int num2 = scanner.nextInt();
        int count2 = countTheNumberOfOne1(num2);
        System.out.println("该数的二进制中1的个数为：" + count2);

        System.out.println("请输入您要输入的数字：");
        int num3 = scanner.nextInt();
        int count3 = countTheNumberOfOne1(num3);
        System.out.println("该数的二进制中1的个数为：" + count3);

        System.out.println("请输入您要输入的数字：");
        int num4 = scanner.nextInt();
        boolean b = judgeNumber(num4);
        if(b){
            System.out.println("该数是2的K次方！");
        }else {
            System.out.println("该数不是2的K次方！");
        }

        System.out.println("请输入您要输入的数字：");
        int num5 = scanner.nextInt();
        printOddEve(num5);

        //溢出多少可以画二进制圆参考
        short a1 = 128;
        short a2 = 120;
        byte b1 = (byte)a1;
        byte b2 = (byte)a2;
        System.out.println(b1);//-128
        System.out.println(b2);//120

        //-128的二进制码如何表示
        //1000 0000 -> 1 1000 0000(-128)
        //             1 0111 1111
        //             1 0000 0000


    }
}
