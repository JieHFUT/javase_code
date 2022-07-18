import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-18
 * Time: 22:11
 */
public class practice_01 {

    public static void main(String[] args) {
        //键入
        Scanner scanner = new Scanner(System.in);//对象
        while(scanner.hasNextInt()){
            int year = scanner.nextInt();
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is century leap year");
                }else{
                    System.out.println(year + " is common year");
                }
            }else{
                if(year % 4 == 0){
                    System.out.println(year + " is common leap year");
                }else{
                    System.out.println(year + " is common year");
                }
            }
        }
    }
    //C语言里面CTRL+c中断程序、正常结束是CTRL+z
    //Java里面停止程序是CTRL+d


    //逻辑控制
    public static void main1(String[] args) {
        //顺序循环
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        //选择结构
        //if switch
        int a = 10;
        if(a == 1){
            System.out.println(a);
        }
        else{
            System.out.println(a-1);
        }
        //循环结构 for while do_while
    }
}
