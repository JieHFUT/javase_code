/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-22
 * Time: 1:15
 */
public class MyDate {

    public int year;
    public int month;
    public int day;


    /**
     * 设置日期
     */
    public void setDate(int myYear, int myMonth, int myDay){
        year = myYear;
        month = myMonth;
        day = myDay;
    }

    public void printDate(){
        System.out.println(year+"年"+month+"月"+day+"日");
    }








    public static void main(String[] args) {

        MyDate myDate1 = new MyDate();
        myDate1.setDate(2022,7,21);
        myDate1.printDate();//2022年7月21日



        MyDate myDate2 = new MyDate();
        myDate2.setDate(2023,8,22);
        myDate2.printDate();//2023年8月22日
    }
}
