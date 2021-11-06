package pro45;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    private static boolean judge(String pattern, String str) {
        String[] strings = str.split(" ");
        String[] patterns = pattern.split("");
        if (pattern.length() != strings.length) {
            return false;
        } else {
            Map<String, String> map = new HashMap<>();
            String result = "";
            /* 建立映射 */
            for (int i = 0; i < strings.length; i++) {
                map.put(patterns[i], strings[i]);
            }
            for (int j = 0; j < patterns.length; j++) {
                result = result.concat(map.get(patterns[j]));
                if (j != patterns.length - 1) {
                    result = result.concat(" ");
                }
            }
            return str.equals(result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String pattern = scanner.nextLine();
        System.out.println(judge(pattern, str));
    }
}
