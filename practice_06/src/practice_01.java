import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-20
 * Time: 16:46
 */
public class practice_01 {
    public static String myToString(int[] array){
        String str = "[";
        for(int i = 0; i < array.length; i++){
            if(i == array.length-1){
                str = str + array[i];

            }else {
                str = str + array[i] + ", ";
            }
        }
        str = str + "]";
        return str;
    }
    public static int[] func4(){
        int array[] = {1,2,3,4,5};
        return array;
    }
    public static void func3(int[] array){
        array[0] = 99;
    }
    public static void func2(int[] array){
        array = new int[]{2,3,4,5,6,7,8,9};
    }
    public static void func1(int a){
        a = 20;
    }

    public static void main(String[] args) {
        int x = 10;
        func1(x);
        System.out.println(x);//10 - 虚拟机栈上的按值传递


        //引用类型的传递
        int[] array1 = {1,2,3,4,5,6,7,8};
        func2(array1);
        System.out.println(Arrays.toString(array1));//[1, 2, 3, 4, 5, 6, 7, 8]

        //引用类型的传递
        int[] array2 = {1,2,3,4,5,6};
        func3(array2);
        System.out.println(Arrays.toString(array2));//[99, 2, 3, 4, 5, 6]

        //数组作为返回值
        //在Java里面全部都是按值传递的，地址也是值
        int array3[] = func4();
        System.out.println(Arrays.toString(array3));//[1, 2, 3, 4, 5]
        //栈上的局部变量array被回收，但是堆上的对象不会被回收

        //my- toString
        int[] array4 = {1,2,3,4,5,6,7,8};
        String ret = myToString(array4);
        System.out.println(ret);

        //数组的拷贝
        int[] array5 = {1,2,3,4};
        int[] arrayCopy = new int[array5.length];
        for (int i = 0; i < array5.length; i++) {
            arrayCopy[i] = array5[i];
        }
        System.out.println(Arrays.toString(arrayCopy));

        //IDEA自带的拷贝
        /**
         * 你要拷贝的数组，长度，返回值是int[]
         */
        int[] array6 = {1,2,3,4,5,6};
        int[] array7 = Arrays.copyOf(array6,array6.length);//扩容多余的为0
        System.out.println(Arrays.toString(array7));

        //拷贝
        int[] array8 = {2,3,4,5};
        int[] array9 = new int[array8.length];
        System.arraycopy(array8,2,array9,3,1);
        System.out.println(Arrays.toString(array9));//[0, 0, 0, 4]

        //拷贝
        int[] array10 = {3,4,5,6,7,8};
        int[] array11 = array10.clone();//在堆山产生一个副本，把副本的地址传给array11
        System.out.println(Arrays.toString(array11));
    }
    //int[] array = {1,2,3,4,5,6,7,8}; ------------------ 不在mian里面的引用在堆里面
    public static void main1(String[] args) {
        //数组的学习
        //中括号当中不能有任何的数字
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(array1.length);
        //System.out.println(array1[10]); ---- ArrayIndexOutOfBoundsException----与c不同，不允许数组越界


        //动态初始化
        int[] array3 = new int[10];//没有初始化的数组，默认全部都是 -> 0/null/false
        array3[1] = 10;

        //简写只有一次机会赋值机会
        int array4[];
        array4 = new int[]{1,2,3,4,5};
        array4 = new int[]{5,6,7,8,9};

        int[] array5 = {1,2,3,4,5};
        //array5 = {2,3,4,5,6}; ------- 报错

        //遍历数组
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //for-each ---- 增强for循环
        for (int x :
             array1) {
            System.out.print(x +" ");
        }
        System.out.println();

        //借助Java本身提供的一些方法来实现数组的打印 --- Arrays类(帮助操作数组) - 可帮助手册--学习
        //toString把参数的数组转换为字符串进行输出，返回值是String
        String str1 = Arrays.toString(array1);
        System.out.println(str1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //数组的底层
        //.java文件--->编译javac----->字节码文件.class (JVM上运行)

        System.out.println(array1);//[I@1b6d3586 ------- 存的是真实地址的哈希值，@前面的I代表的是整型数组, [代表是数组

        int[] array6 = null;//不指向任何对象
        //System.out.println(array6.length);//NullPointerException - 空指针异常
        System.out.println(array6);//null


        //引用赋值同对象
        int array7[] = {1,2,3,4,5,6,7,8};
        int array8[] = array7;
        System.out.println(array7);//[I@4554617c
        System.out.println(array8);//[I@4554617c

        //引用不去赋给另外一个引用时就算指向对象内容一样，对象也不一样
        int array9[] = {1,2,3,4,5,6,7,8};
        System.out.println(array9);//[I@74a14482

    }
}
