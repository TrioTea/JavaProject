package pro26;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = String.valueOf(num);
        System.out.println(num + "是一个" + str.length() + "位数。");
        StringBuilder sb = new StringBuilder(str);
        System.out.println("按逆序输出是：" + sb.reverse().toString());
    }
}
