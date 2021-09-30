package operation;

import book.BookList;

import java.util.Scanner;

public interface IOperation {
    void work(BookList bookList);

    default String GetName(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入你要操作的书名：");
        return scanner.nextLine();
    }
}
