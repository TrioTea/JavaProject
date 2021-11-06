package function9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        System.out.println(wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String str) {
        /* 略*/
        String[] strings = str.split(" ");
        String[] patterns = pattern.split("");
        if (pattern.length() != strings.length) {
            return false;
        } else {
            HashMap<String, String> map = new HashMap<String, String>();
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
}
