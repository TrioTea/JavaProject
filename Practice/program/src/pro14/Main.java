package pro14;

/**
 * @author 比茗还明
 */
public class Main {
    public static int number = 100000;

    static boolean judge(int num) {
        double first;
        int second;
        first = Math.sqrt(num);
        second = (int) first;
        return second - first == 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < number; i++) {
            if (judge(i + 100)) {
                if (judge(i + 100 + 168)) {
                    System.out.println(i + "加100是一个完全平方数，再加168又是一个完全平方数");
                }
            }
        }
    }
}
