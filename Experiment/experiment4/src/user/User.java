package user;

import operation.IOperation;
import person.PersonList;

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
        return scanner.nextInt();
    }

    public void doOperation(int choice, PersonList personList) {
        this.iOperations[choice].work(personList);
    }
}
