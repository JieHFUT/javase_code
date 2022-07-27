package user;

import book.Book;
import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-27
 * Time: 3:31
 */
public abstract class User {

    protected String name;

    public IOperation[] iOperations;//接口数组

    public User(String name) {
        this.name = name;
    }

    public abstract int meau();


    public void doOperation(int choice, BookList bookList){
        iOperations[choice].work(bookList);
    }


}
