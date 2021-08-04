package operation;

import book.Book;
import book.BookList;

public class FindOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍：");
        String name = this.GetName();

        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (name.equals(book.getName())) {
                System.out.println("找到了！！此书如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有" + name + "这本书");
    }
}
