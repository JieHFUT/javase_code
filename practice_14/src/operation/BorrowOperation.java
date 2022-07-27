package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 3:29
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借用图书！");
        System.out.println("请输入你要借阅的图书名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        int i = 0;
        int currentSize = bookList.getUsedSize();
        for (i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed() == true){
                    System.out.println("你要借阅的图书已经被借出！");
                    return;
                }else {
                    book.setBorrowed(true);
                    System.out.println("借阅成功！");
                    return;
                }
            }
        }
        //查找的图书不存在
        System.out.println("你查询的图书不存在！");

    }
}
