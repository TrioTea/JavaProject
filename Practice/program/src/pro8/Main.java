package pro8;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        long b = 0;
        Scanner scanner = new Scanner(System.in);
        long a=scanner.nextInt();
        int n = scanner.nextInt();
        int i = 0;
        long sum = 0;
        while (i < n) {
            b = b + a;
            sum = sum + b;
            a = a * 10;
            ++i;
        }
        System.out.println(sum);
    }
}
