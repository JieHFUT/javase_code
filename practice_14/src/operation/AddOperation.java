package operation;

import book.Book;
import book.BookList;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-26
 * Time: 22:00
 */
public class AddOperation implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书！");
        System.out.println("请输入图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的类型：");
        String type = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        double price = scanner.nextDouble();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUsedSize();
        bookList.setPos(currentSize,book);
        bookList.setUsedSize(currentSize+1);
        System.out.println("新增成功！");

    }
}































