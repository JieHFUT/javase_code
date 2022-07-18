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
