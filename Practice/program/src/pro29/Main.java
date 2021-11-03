package pro29;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())){
            System.out.println("这是一个回文数");
            return;
        }
        System.out.println("这不是一个回文数");
    }
}
