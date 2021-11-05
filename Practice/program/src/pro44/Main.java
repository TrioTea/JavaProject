package pro44;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("");
        LinkedHashSet<String> strings=new LinkedHashSet<>();
        Collections.addAll(strings, split);
        for (String string : strings) {
            System.out.print(string);
        }
    }
}
