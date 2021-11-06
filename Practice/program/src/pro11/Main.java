package pro11;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static int number = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = 0, high;
        high = scanner.nextDouble();
        for (int i = 0; i < number; i++) {
            distance += high;
            high = high / 2;
            distance += high;
        }
        System.out.println("经过路程" + (distance - high));
        System.out.println("反弹高度" + high);
    }
}
