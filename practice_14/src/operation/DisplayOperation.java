package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 5:29
 */
public class DisplayOperation implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书！");

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
