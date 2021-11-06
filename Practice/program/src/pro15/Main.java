package pro15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        String[] words = str.split("");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
