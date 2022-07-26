package deepclonable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-26
 * Time: 16:22
 */




class Money implements Cloneable{
    public double m = 19.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
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
        //return super.clone();
        Person tmp = (Person) super.clone();
        tmp.money = (Money) this.money.clone();
        return tmp;
    }

}








public class Copyable2 {

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
