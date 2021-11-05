package pro38;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        String str = Long.toString(num);
        char[] ch = str.toCharArray();
        int len = ch.length;
        System.out.println("截取从右端开始的4～7位是：" + ch[len - 7] + ch[len - 6] + ch[len - 5] + ch[len - 4]);
    }
}