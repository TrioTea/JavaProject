import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("java hello!!");
        Scanner num = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int temp;
            temp = Integer.parseInt(args[i]);
            sum += temp;
        }
        float aver = (float) sum / 3;
        System.out.println("平均值" + aver);
    }
}
