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
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");//采取元素覆盖的方法

        System.out.println("请输入你要删除图书的名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int index = 0;
        int i = 0;
        int currentSize = bookList.getUsedSize();
        for (i = 0; i < currentSize; i++) {
            Book book = bookList.getPos(i);
            if(book.getName().equals(name)){
                System.out.println("找到了这本书，已删除！");
                index = i;
                break;
            }
        }
        //1、遇到了break   2、for循环结束，没有找到
        if(i == currentSize){
            System.out.println("没有找到你要删除的图书！");
            return ;
        }
        //覆盖
        for (int j = index; j < currentSize -1; j++) {
            Book book = bookList.getPos(j+1);

            bookList.setPos(j,book);
        }
        bookList.setPos(currentSize - 1,null);
        bookList.setUsedSize(currentSize - 1);
    }
}
