/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-20
 * Time: 17:51
 */
public class practice_03 {
    //斐波那契数列循环打印
    public static int printFib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2) {
            return 1;
        }
        int fib1 = 0;
        int fib2 = 0;
        int fib3 = 0;
        for(int i = 3; i <= n; i++){
            fib3 = fib2 + fib1;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib3;
    }
    //斐波那契数列递归比较耗时，可用循环改进
    public static int printFibonacci(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return printFibonacci(n - 1) + printFibonacci(n - 2);

    }
    public static void printArray(int[] array, int len){
        //顺序打印数组
        if(len == 1){
            System.out.println(array[0]);
            return;
        }
        printArray(array, len-1);
        System.out.println(array[len-1]);//和递归交换顺序即可逆序
    }
    public static void printArray1(int[] array, int len){
        //逆序打印数组
        if(len != 1){
            System.out.println(array[len-1]);
            printArray1(array, len-1);
            return;
        }
        System.out.println(array[0]);

    }
    //输入一个正整数，输出它的各个数字之和43214 -> 4+3+2+1+4
    public static int returnSum(int n){
        if(n < 10){
            return n;
        }
        return n % 10 +returnSum(n / 10);
    }
    //按顺序打印一个数字的每一位
    public static void printOrder2(int n){
        if(n <= 9){
            System.out.println(n);
            return;
        }
        printOrder2(n / 10);
        System.out.println(n % 10);
    }
    //按顺序打印数字的每一位1、2、3、4、5、6、7、8、9
    public static void printOrder1(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printOrder1(n - 1);
        System.out.println(n - 1);

    }
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n - 1);
    }
    public static void func(int n){
        if(n == 1){
            System.out.println(n);
        }else {
            func(n - 1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        //递归
        //调用自己本身、拥有终止的条件
        func(5);//1.2.3.4.5

        //推导递推公式、寻找终止条件
        int ret1 = factorial(5);
        System.out.println(ret1);

        printOrder1(10);

        printOrder2(431245);

        int ret2 = returnSum(32415);
        System.out.println(ret2);

        int[] arr = {1,2,3,4,5};
        printArray(arr,arr.length);
        printArray1(arr,arr.length);

        int ret3 = printFibonacci(20);
        System.out.println(ret3);
    }
}
