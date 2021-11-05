package pro30;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int flag = 0;
            for (int j = i-1; j > 1; j--) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
