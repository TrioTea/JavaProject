package study;
import java.util.Arrays;

public class Textbook {
    private String book_name;
    private int book_num;

    @Override
    public String toString() {
        return this.book_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public Textbook(String book_name) {
        this.book_name = book_name;
    }

    public Textbook(String book_name, int book_num) {
        this.book_name = book_name;
        this.book_num = book_num;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_num() {
        return book_num;
    }

    public void setBook_num(int book_num) {
        this.book_num = book_num;
    }
}
