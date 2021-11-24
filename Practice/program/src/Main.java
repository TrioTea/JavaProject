import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double he = in.nextFloat();
        double s = he / 2;
        //第一次反弹的高度
        for (int i = 2; i <= 10; i++) {
            he = he + s * 2;
            //第i次落地经过多少米
            s = s / 2;
            //第i次反弹的高度
        }
        System.out.print("经过路程");
        System.out.println(he);
        System.out.println("反弹高度" + s);
        in.close();
    }
}
