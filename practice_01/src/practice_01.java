public class practice_01 {
    public static void main(String[] args) {
        //整数转字符串
        int num1 = 1000;
        String str1 = num1 + "";
        String str2 = String.valueOf(num1);
        System.out.println(str2);
        //字符串转整数
        String str3 = "123";
        int num2 = Integer.valueOf(str3);
        System.out.println(str3 + 1);//1231
        System.out.println(1 + str3);//1123
        System.out.println(num2 + 1);//124

        int num3 = Integer.parseInt(str3);
        System.out.println(num3);
    }
    public static void main11(String[] args) {
        //字符串类型
        String str1 ="wangrenjie";
        System.out.println(str1);
        String str2 = " is cool";
        //字符串的拼接
        System.out.println(str1 + str2);//wangrenjie is cool

        //例如：字符串的拼接
        int a = 10;
        int b = 20;
        System.out.println("a = "+a+" b = "+b);//a = 10 b = 20
        System.out.println("a+b = "+a+b);//a+b = 1020
        System.out.println("a+b = "+(a+b));//a+b = 30
        System.out.println(a+b+ "<- a+b");//30<- a+b

        int num = 10;
        String str  = num+"";
        System.out.println(str);//此时str为字符串10；不为十；
    }
    public static void main10(String[] args) {
        //类型转换
        //自动类型转换
        //强制类型转换（显式）

        //类型提升
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);//低于4个字节的会提升为int，再参与运算
    }
    public static void main9(String[] args) {
        //java中Boolean类型只能有true和false两种类型
        //jvm中没有给定明确的大小，有说占1个字节的，有说占1比特的
        boolean flg = true;
        if(flg){
            System.out.println("hello world");
        }
        int a = 0;
        if(a != 0){
            System.out.println("hello world");
        }
    }
    public static void main8(String[] args) {
        char ch1 = 'a';//2个字节
        char ch2 = '长';
        System.out.println(ch1);//a
        System.out.println(ch2);//长
        //String s = "王仁杰";
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }
    public static void main7(String[] args) {
        //8个字节
        double d = 19.9;
        double num = 1.1;
        System.out.println(num * num);//1.2100000000000002
        //对于小数其实没有精确的数值，其以指数形式表示，例如float精确到小数点后六位
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }
    public static void main6(String[] args) {
        //4个字节
        float f = 12.5f;//不加f默认为double型
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
    public static void main5(String[] args) {
        //字节类型：1字节----表示数值的有7位比特
        byte b1 = 18;
        byte b2 = (byte)128;
        System.out.println(b1);
        System.out.println(b2);//-128
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public static void main4(String[] args) {
        //短整形2个字节----15比特的数值位
        short sh = 10;
        System.out.println(sh);
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
    }
    public static void main3(String[] args) {
        //long类型占用8个字节---表示数值的有63个比特位
        //long a = 10;
        long a = 10L;//定义长整形一般在后面加一个L（小写的l易看成1），不加默认为int类型
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);//9223372036854775807
        System.out.println(Long.MIN_VALUE);//-9223372036854775808
    }
    public static void main2(String[] args) {
        int a = 10;//不初始化会进行报错
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int ret  = Integer.valueOf("12345");//字符串转整数
        System.out.println(ret);

    }
    public static void main1(String[] args) {
        //sout_输出
        //psvm_main
        System.out.println("Hello World");
        boolean flg = true;
        System.out.println(flg);//flg.sout_快捷键

    }
}
