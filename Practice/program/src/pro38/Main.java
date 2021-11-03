package pro38;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(sb);
        }
    }
}
