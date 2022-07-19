import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-19
 * Time: 15:51
 */
public class practice_02 {

    //求一个整数，在内存当中存储时，二进制1的个数
    public static int theNumberOfOne(int num){
        int i = 0;
        int count = 0;
        for(i = 1; i <= 32; i++){
            if((num & 1) == 1){
                count++;
            }
            num = num >>> 1;
        }
        return count;
    }
    //输出n*n的乘法口诀表，n由用户输入。
    public static void printNtable(int n){
        int i = 1;
        int j = 1;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(" "+String.format("%2d",j)+"*"+String.format("%2d",i)+"="+String.format("%2d",j*i)+" ");
            }
            System.out.println();
        }
    }

    /**
     * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
     * 密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
     * @param str1
     * @param str2
     * @return
     */
    public static Boolean passcodeInput(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
    //获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。
    public static void getAndPrint(int num){
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((num >>> i) & 1) + " " );
        }
        System.out.println();
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((num >>i) & 1) + " " );
        }
    }
    //写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
    public static int theOneNumber(int n){
        int i = 0;
        int count = 0;
        for(i = 1; i <= 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    //求0-999之间的水仙花数并且输出
    public static void printNarcissisticNumber(){
        int i = 0;
        for(i = 100; i <= 999; i++){
            int bai = i / 100;
            int shi = i % 100 / 10;
            int ge  = i %10;
            if(i == Math.pow(bai,3) + Math.pow(shi,3) + Math.pow(ge,3)){
                System.out.println(i);
            }
        }
    }
    //求两个正整数的最大公约数
    public static int findCommonDivisor(int a, int b){
        if(a < b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        for(int i = b; i > 1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;

    }
    //输出乘法口诀表
    public static void printMultiplicationTable(){
        int i = 0;
        int j = 0;
        for(i = 1; i <= 9; i++){
            for(j = 1; j <= i; j++){
                System.out.printf("%2d*%2d=%2d ",j,i,i*j);
            }
            System.out.println();
        }
    }
    //输出1000-2000之间所有的闰年
    public static void printLeapYear(){
        int i = 0;
        for(i = 1000; i <= 2000; i++){
            if(i % 400 == 0 || (i % 100 != 0 && i % 4 == 0)){
                System.out.println(i);
            }
        }
    }
    //打印1-100之间的所有的素数
    public static void printPrimeNumber(){
        int i = 0;
        for(i = 1; i <= 100; i++){
            boolean b = isPrimeNumber(i);
            if(b == true){
                System.out.println(i);
            }
        }
    }
    //判断一个数字是否是素数
    public static boolean isPrimeNumber(int num){
        int i = 0;
        int j = 0;
        int count = 0;
        for(i = 2; i < num; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }

    //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static String judgeAge(int age){
        if(age <= 18){
            return "少年";
        } else if (19 <= age && age <= 28) {
            return "青年";
        } else if (29 <= age && age <= 55) {
            return "中年";
        } else if (56 <= age) {
            return "老年";
        }else {
            return "您输入的年龄有误！";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = scanner.nextInt();
        String str = judgeAge(age);
        System.out.println(str);

        System.out.println("请输入您要输入的数字：");
        int num1 = scanner.nextInt();
        boolean flg1 = isPrimeNumber(num1);
        if(flg1==true){
            System.out.println(num1 + " is prime number!");
        }else{
            System.out.println(num1 + " is not prime number!");
        }

        System.out.println("1-100之间所有的素数为：");
        printPrimeNumber();

        System.out.println("1000-2000之间所有的闰年为：");
        printLeapYear();

        System.out.println("乘法口诀表为：");
        printMultiplicationTable();

        System.out.println("请输入两个整数：");
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int ret = findCommonDivisor(num2, num3);
        System.out.println("最大公约数是：" + ret);

        System.out.println("0-999之间的水仙花数为：");
        printNarcissisticNumber();

        int num4 = scanner.nextInt();
        int number = theOneNumber(num4);
        System.out.println("此二进制数字中1的个数为：" + number);

        int num5 = scanner.nextInt();
        getAndPrint(num5);

        int i = 0;
        String str1 = "9594523wrj";
        for(i = 1; i <=3; i++){
            System.out.println("请输入你的密码：");
            String str2 = scanner.next();
            boolean flg2 = passcodeInput(str1,str2);
            if(flg2 == true){
                System.out.println("您输入的密码正确！");
                break;
            }else{
                if(i == 3){
                    System.out.println("您已经输入三次错误密码！已退出程序！");
                    break;
                }else{
                    System.out.println("您输入的密码错误！请重新输入：");
                }

            }
        }

        System.out.println("请输入您要输出的乘法口诀表行数：");
        int num6 = scanner.nextInt();
        printNtable(num6);

        System.out.println("请输入您要输入的整数：");
        int num7  = scanner.nextInt();
        int count = theNumberOfOne(num7);
        System.out.println(count);


    }
}
