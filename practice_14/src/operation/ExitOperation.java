package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 3:30
 */
public class ExitOperation implements IOperation{

    //可能需要销毁使用过的内存
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            bookList.setPos(i,null);
        }
        System.exit(0);
    }
}
