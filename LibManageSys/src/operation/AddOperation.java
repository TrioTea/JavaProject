package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍：");
        String name = this.GetName();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book= bookList.getBook(i);
            if (name.equals(book.getName())) {
                System.out.println("此书已存在，无需新增！");
                return;
            }
        }
        System.out.println("请输入此书作者");
        String author = new Scanner(System.in).nextLine();
        System.out.println("请输入此书的价格");
        int price = new Scanner(System.in).nextInt();
        System.out.println("请输入图书的类型");
        String type = new Scanner(System.in).nextLine();
        Book book = new Book(name, author, price, type);
        bookList.setBooks(currentSize, book);
        bookList.setUsedSize(currentSize + 1);
        System.out.println("新增成功");
    }
}
