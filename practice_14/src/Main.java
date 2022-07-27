import book.BookList;
import user.AdminUser;
import user.NomalUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-26
 * Time: 21:32
 */
public class Main {


    public static User login(){
        System.out.println("请输入姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份：1->管理员    0->普通用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new AdminUser(name);
        }else {
            return new NomalUser(name);
        }
    }



    public static void main(String[] args) {

        BookList bookList = new BookList();
        User user = login();//user到底引用的是哪一个对象；


        while(true){
            int choice = user.meau();//返回值0、1、2、3、4对应不同操作
            //怎么看引用了哪个对象 --- user
            //选择了1以后，怎么看user引用对象的具体方法操作 ------- doOperation

            user.doOperation(choice,bookList);

        }

    }
}































