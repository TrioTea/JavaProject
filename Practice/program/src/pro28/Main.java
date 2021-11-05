package pro28;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int year, mouth, day = 0, days;
        int d = 0, e = 0;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        mouth = scanner.nextInt();
        days = scanner.nextInt();
        for (int i = 1; i < mouth; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    day = 31;
                    break;
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    day = 30;
                    break;
                }
                case 2: {
                    if (year % 100 != 0 && year % 4 == 0) {
                        day = 29;
                    } else if (year % 100 == 0 && year % 400 == 0) {
                        day = 29;
                    } else {
                        day = 28;
                    }
                }
                default:
                    break;
            }
            d += day;
        }
        System.out.println("It is the the day:" + (d + days));
    }
}
