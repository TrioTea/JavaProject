package pro18;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        int t = gy(m, n);
        System.out.println("最大公约数: " + t);
        System.out.println("最小公倍数: " + m * n / t);
    }

    private static int gy(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        return gy(n, m % n);
    }
}