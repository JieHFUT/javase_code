package lightclonable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-25
 * Time: 22:57
 */




class Money {
    public double m = 19.9;
}




class Person implements Cloneable{
    public int id = 1231;

    Money money = new Money();

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}








public class Copyable {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person();
        Person person2 = (Person)person1.clone();
        System.out.println(person2);//克隆一个副本：Person{id='1231'}

        System.out.println(person1.money.m);
        System.out.println(person2.money.m);
        System.out.println("=========");
        person2.money.m = 99.9;
        System.out.println(person1.money.m);
        System.out.println(person2.money.m);


    }
}
