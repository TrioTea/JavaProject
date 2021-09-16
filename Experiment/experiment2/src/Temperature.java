import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("请输入摄氏度：");
        Scanner input = new Scanner(System.in);
        int Cnum = input.nextInt();
        float Tnum = (float) ((float) Cnum * 1.8 + 32);
        System.out.println(Cnum + "℃ 转换为 " + Tnum + "℉");
    }
}
