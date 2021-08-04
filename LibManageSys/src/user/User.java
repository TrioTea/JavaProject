package user;

import book.BookList;
import operation.IOperation;

import java.util.Scanner;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    protected int GetChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;
    }

    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }
}
