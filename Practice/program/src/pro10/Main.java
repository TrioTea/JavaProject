package pro10;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static String firstLetterToUpperCase(String s) {
        String result = "";
        String[] value = s.split(" ");
        for (String item : value) {
            String firstLetter = item.substring(0, 1).toUpperCase();
            String otherLetter = item.substring(1);
            result = result.concat(firstLetter.concat(otherLetter) + " ");
        }
        //去掉字符串末尾多余的空格
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(firstLetterToUpperCase(string));
    }
}