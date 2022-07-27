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
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查询图书！");
        System.out.println("请输入图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int i  = 0;
        int currentSize = bookList.getUsedSize();
        for (i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)) {
                System.out.println("查找到了您要查找的书籍：" + book);
                return;
            }
        }
            System.out.println("没有找到这本书！");
    }
}
