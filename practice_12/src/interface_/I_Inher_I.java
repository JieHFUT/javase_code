package interface_;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-24
 * Time: 16:58
 */


interface A{
    void funcA();
}

interface B{
    void funcB();
}

interface C extends A,B{
    void funcC();
}












class AA implements C{
    @Override
    public void funcA() {
        System.out.println("覆盖AfuncA()");
    }

    @Override
    public void funcB() {
        System.out.println("覆盖B的funcB()");
    }

    @Override
    public void funcC() {
        System.out.println("覆盖C的funcC()");
    }
}









public class I_Inher_I {
    //接口之间的继承
}
