import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        int pnum = 1, qnum = 1, temp = 0;
        System.out.println("请输入你想打印的Fibonacci数个数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("1");
        } else {
            System.out.print("1 1 ");
        }
        for (int i = 2; i < number; i++) {
            temp = pnum + qnum;
            System.out.print(temp + " ");
            pnum = qnum;
            qnum = temp;
        }
    }
}
