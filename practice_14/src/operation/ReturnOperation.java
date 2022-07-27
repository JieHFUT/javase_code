package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 3:30
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");

        System.out.println("请输入你要归还的书籍的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i = 0;
        int currentSize = bookList.getUsedSize();
        for (i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)){
                //找到要归还的书
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有查询到你要归还的书！");
    }
}
