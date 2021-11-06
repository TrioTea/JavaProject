package function7;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static long factorial1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial1(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        //通过递归
        long fact1 = factorial1(n);
        System.out.printf("%d!=%d", n, fact1);
    }
}
