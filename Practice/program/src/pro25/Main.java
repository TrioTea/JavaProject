package pro25;

/**
 * @author 比茗还明
 */
public class Main {
    /**
     * @author 比茗还明
     */
    public static void main(String[] args) {
        double sum = 0;
        double son = 2, mon = 1;
        double temp = 0;
        for (int i = 0; i < 20; i++) {
            sum += son / mon;
            temp = son + mon;
            mon = son;
            son = temp;
        }
        System.out.println("前20项相加之和是： " + sum);
    }
}
