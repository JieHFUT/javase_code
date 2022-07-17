public class practice_01 {
    public static void main(String[] args) {
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
