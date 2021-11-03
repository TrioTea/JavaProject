package pro33;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String human1 = scanner.nextLine();
        int age1 = scanner.nextInt();
        scanner.nextLine();
        String human2 = scanner.nextLine();
        int age2 = scanner.nextInt();
        Human person = new Human(age1, human1);
        Human person2 = new Human(age2, human2);
        person.compare(person2);
    }
}

class Human {
    int id, age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void compare(Human human) {
        if (this.age > human.getAge()) {
            System.out.println(this.getName() + "大!");
        } else if (this.age < human.getAge()) {
            System.out.println(human.getName() + "大!");
        } else {
            System.out.println("同龄");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
