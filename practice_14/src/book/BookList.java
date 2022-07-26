package book;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: JIE
 * Date: 2022-07-26
 * Time: 21:40
 */


//这是一个书架类
public class BookList {

    private Book[] books = new Book[10];//这个书架的大小

    private int usedSize;//书架中放置了几本书

    public BookList(){
        books[0] = new Book("四世同堂","老舍",98,"小说");
        books[1] = new Book("活着","余华",45,"小说");
        books[2] = new Book("概率论","朱士信",23,"数学");
        books[3] = new Book("三体","刘慈欣",123,"科幻");
        this.usedSize = 4;
    }

    /**
     * 获取当前数组当中元素的个数
     * @return
     */
    public int getUsedSize() {
        return usedSize;
    }

    /**
     * 修改当前数组中元素的多少
     * @param usedSize
     */
    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
