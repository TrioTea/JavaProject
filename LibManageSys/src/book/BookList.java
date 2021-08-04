package book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        this.books[0] = new Book("三国演义", "罗贯中", 17, "小说");
        this.books[1] = new Book("西游记", "吴承恩", 23, "小说");
        this.books[2] = new Book("水浒传", "施耐庵", 32, "小说");
        this.usedSize = 3;
    }

    /*
      默认放到顺序表的最后
     */
    public void setBooks(int pos, Book book) {
        this.books[pos] = book;
    }

    public Book getBook(int pos) {
        return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
