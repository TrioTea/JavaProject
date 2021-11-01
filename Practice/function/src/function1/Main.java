package function1;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Shape {// 抽象类

    /**
     * 抽象方法 求面积
     */
    public abstract double getArea();

    /**
     * 抽象方法 求周长
     */
    public abstract double getPerimeter();
}

/* 你提交的代码将被嵌入到这里 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");
        // 保留2位小数
        double r = input.nextDouble();
        Shape c = new Circle(r);
        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    }
}


/**
 * 请在这里填写答案
 */
class Circle extends Shape {
    double radius;
    final static double PI = 3.1415926;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * PI * radius;
    }

}