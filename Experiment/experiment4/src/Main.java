import person.Person;
import person.PersonList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();

        System.out.println("请输入你的身份；0>>普通用户 || 1>>管理员");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.toString();
        User user = login();
        //noinspection InfiniteLoopStatement
        do {
            int Choice = user.menu();
            user.doOperation(Choice, personList);
        } while (true);
    }
}
