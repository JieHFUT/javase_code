package clonable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-25
 * Time: 22:57
 */

class Person implements Cloneable{
    public int id = 1231;


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

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = person1;



    }
}
