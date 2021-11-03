package pro22;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        float sum = 0;
        float son = 2, mon = 1;
        float temp = 0;
        for (int i = 0; i < n; i++) {
            sum += son / mon;
            temp = son + mon;
            mon = son;
            son = temp;
        }
        System.out.println(sum);
    }
}