package function2;

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Shape {// 抽象类

    /* 抽象方法 求面积 */

    public abstract double getArea();

    /* 抽象方法 求周长 */

    public abstract double getPerimeter();
}

/* 你提交的代码将被嵌入到这里 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");// 保留2位小数
        double width = input.nextDouble();
        double height = input.nextDouble();
        Shape c = new Rectangle(width, height);
        System.out.println(d.format(c.getArea()));
        System.out.println(d.format(c.getPerimeter()));
        input.close();
    }
}


/* 请在这里填写答案 */
class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}