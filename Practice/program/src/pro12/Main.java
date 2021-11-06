package pro12;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {

    public static void main(String[] args) {
        int count = 0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String string2 = scanner.nextLine();
        while ((index = string.indexOf(string2, index)) != -1) {
            index = index + string2.length();
            count++;
        }
        System.out.println(string2 + "字符串的个数" + count);
    }
}
