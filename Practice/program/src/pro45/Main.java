package pro45;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    private static boolean judge(String pattern, String str) {
        if (pattern.length() != str.split(" ").length) {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.nextLine();
        System.out.println(judge(pattern, str));
    }
}
