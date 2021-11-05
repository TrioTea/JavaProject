package pro43;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    static class Animal {
        public void call() {
            System.out.println("一只动物正在叫");
        }
    }

    static class Bird extends Animal {
        String name;

        public Bird(String name) {
            this.name = name;
        }

        @Override
        public void call() {
            super.call();
            System.out.println(this.name + "正在鸟叫");
        }
    }

    static class Dog extends Animal {
        String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public void call() {
            super.call();
            System.out.println(this.name + "正在狗叫");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        Bird bird = new Bird(str1);
        Dog dog = new Dog(str2);
        bird.call();
        dog.call();
    }
}

