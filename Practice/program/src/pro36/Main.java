package pro36;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("小明");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        person.setName(name);
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (this.name.equals(name)) {
            System.out.println("改名失败");
            return;
        }
        System.out.println(this.name + "改名为：" + name);
        this.name = name;
    }
}