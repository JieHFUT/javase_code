import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-18
 * Time: 23:46
 */
public class practice_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();//如果Random括号里面有数字，将会产生固定的随机数
        //自己查询Math.random()的用法;
        int randNum = random.nextInt(100) + 1; //[0,100)->[1,101)

        while(true){
            System.out.println("请输入要猜的数字：");
            int num = scanner.nextInt();
            if(num < randNum){
                System.out.println("您猜小了！");
            } else if (num ==randNum) {
                System.out.println("您猜对了！");
                break;
            }else{
                System.out.println("您猜大了！");
            }

        }
    }
    public static void main12(String[] args) {
        //循环输入 CTRL+D结束
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n = scanner.nextInt();
            System.out.println(n);
        }
    }
    public static void main11(String[] args) {
        //do{} while();至少执行一次
        //输入、输出
        System.out.println("输出且换行");
        System.out.print("输出不换行");
        System.out.printf("%d\n",5);

        //import java.util.Scanner;  导包
        //System.in--------------从键盘读入数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name1 = scanner.next();//next遇到空格读取结束
        System.out.println("姓名：" + name1);

        System.out.println("请输入你的姓名：");
        String name2 = scanner.nextLine();//nextLine读取一行
        System.out.println("姓名：" + name2);


        System.out.println("请输入你的年龄：");
        int age = scanner.nextInt();
        System.out.println("年龄为：" + age);

        System.out.println("请输入你的工资：");
        float salary = scanner.nextFloat();
        System.out.println("工资：" + salary);

        scanner.close();//关闭资源

    }
    public static void main10(String[] args) {
        int sumEve = 0;
        int sumOdd = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sumEve += i;
            }else{
                sumOdd += i;
            }
        }
        System.out.println("偶数和为" + sumEve);
        System.out.println("奇数和为" + sumOdd);
    }
    public static void main9(String[] args) {
        //for循环
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }
        //for循环的第一个条件可以省略不写，可以定义在外面
        int j = 1;
        for(; j < 10; j++){
            System.out.println(j);
        }
    }
    public static void main8(String[] args) {
        int i = 1;
        while(i <= 100){
            if(i % 15 != 0){
                i++;//i++不可少
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
    public static void main7(String[] args) {
        //找到1-100之间能被3和5整除的数字
        int i = 1;
        for(i = 1; i <=100; i++){
            //if((i % 3 == 0)&&(i % 5 ==0)){
            //    System.out.println(i);
            //}
            if((i % 3 != 0)||(i % 5 != 0)){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void main6(String[] args) {
        //break continue
        int i = 1;
        while(i <= 10){
            if(i == 3){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }//1、2 死循环
    public static void main5(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 1;
        int ret  =0;
        while(i <= 5){
            j = 1;
            sum = 1;
            while(j <= i){
                sum *= j;
                j++;
            }
            ret += sum;
            i++;
        }
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        int i = 1;
        int ret = 1;
        while(i <= 5){
            ret *= i;
            i++;
        }
    }
    public static void main3(String[] args) {
        int i = 1;
        int sum = 0;
        while(i <= 100){
            sum = sum + i;
            i++;
        }
    }

    public static void main2(String[] args) {
        //循环结构
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    public static void main1(String[] args) {
        //switch语句---(int short byte String char)   !(long float double boolean)
        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();
        switch(a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default://位置可以不固定
                System.out.println("error");
                break;
        }

        String str  = "1";
        switch(str){
            case"1":
                System.out.println(1);
                break;
            default:
                System.out.println(2);
                break;
        }
    }
}
