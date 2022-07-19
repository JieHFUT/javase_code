import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-19
 * Time: 15:51
 */
public class practice_02 {

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
        int num = scanner.nextInt();
        boolean flg = isPrimeNumber(num);
        if(flg ==true){
            System.out.println(num + " is prime number!");
        }else{
            System.out.println(num + " is not prime number!");
        }

        System.out.println("1-100之间所有的素数为：");
        printPrimeNumber();

        System.out.println("1000-2000之间所有的闰年为：");
        printLeapYear();

        System.out.println("乘法口诀表为：");
        printMultiplicationTable();


    }
}
