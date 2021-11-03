package pro24;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        long sum = 0, temp = 1;
        for (int i = 1; i <= 20; i++) {
            temp = 1;
            for (int j = i; j > 0; j--) {
                temp = j * temp;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
