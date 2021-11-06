package pro39;

/**
 * @author 比茗还明
 */
public class Main {

    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            for (int j = 0; j < (rows - i - 1) * 2 + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.format("%d   ", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}