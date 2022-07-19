import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-19
 * Time: 14:20
 */
public class practice_01 {
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
        int year  = scanner.nextInt();
        boolean flg = isLeapYear(year);
    }
}
