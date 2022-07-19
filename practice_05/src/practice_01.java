import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-19
 * Time: 14:20
 */
public class practice_01 {
    //Math.sqrt();  Math.pow();  进入Math类 alt+7
    public static void perfect(){
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

        perfect();
    }
}
