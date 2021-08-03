package testdemo;

class Animal {
    String name;

    public void eat() {
        System.out.println(this.name + "会吃饭！");
    }

    public Animal(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    String name = "大花花";//试试

    public void jump() {
        System.out.println(super.name + "会跳!");
    }

    public Cat() {
        super("小花花");
    }
}

public class Teat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.jump();
    }
}
