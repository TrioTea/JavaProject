package pro19;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char[] b = a.toCharArray();

        int letter = 0;
        int num = 0;
        int space = 0;
        int character = 0;

        for (int i = 0; i < b.length; i++) {
            b[i] = a.charAt(i);
            if (63 <= b[i] && b[i] <= 90 || 97 <= b[i] && b[i] <= 122) {
                letter++;
            } else if (48 <= b[i] && b[i] <= 57) {
                num++;
            } else if (b[i] == 32) {
                space++;
            } else {
                character++;
            }
        }
        System.out.println("字母个数：" + letter);
        System.out.println("数字个数：" + num);
        System.out.println("空格个数：" + space);
        System.out.println("其他字符个数：" + (character));
    }
}