package programsecond.pro1;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;
        String name = scanner.next();
        int point = scanner.nextInt();
        if ("Undergraduate".equals(name)) {
            student = new Undergaduate(name, point);
        } else if ("Postgraduate".equals(name)) {
            student = new Postgraduate(name, point);
        }
        System.out.println("课程等级为："+student);
    }
}

abstract class Student {
    String name;
    int point;

    public Student(String name, int point) {
        this.name = name;
        this.point = point;
    }

    abstract String calculate();

    @Override
    public String toString() {
        return this.calculate();
    }
}

class Postgraduate extends Student {
    public Postgraduate(String name, int point) {
        super(name, point);
    }

    @Override
    String calculate() {
        if (this.point >= 90) {
            return "优秀";
        } else if (this.point >= 80) {
            return "良好";
        } else if (this.point >= 70) {
            return "一般";
        } else if (this.point >= 60) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}

class Undergaduate extends Student {
    public Undergaduate(String name, int point) {
        super(name, point);
    }


    @Override
    String calculate() {
        if (this.point >= 80) {
            return "优秀";
        } else if (this.point >= 70) {
            return "良好";
        } else if (this.point >= 60) {
            return "一般";
        } else if (this.point >= 50) {
            return "及格";
        } else {
            return "不及格";
        }
    }
}