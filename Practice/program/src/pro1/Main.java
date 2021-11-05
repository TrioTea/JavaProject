package pro1;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 5 != 0) {
            System.out.println("输入数据错误");
        } else {
            Thread myThread = new Thread(() -> {
                int flag = 0, x = 0;
                for (int i = 0; i < num; i++) {
                    if (flag % 5 == 0) {
                        System.out.println("===" + x);
                        x+=5;
                    }
                    System.out.print(i + "    ");
                    System.out.println("线程睡眠1秒！");
                    flag++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            myThread.start();
        }
    }
}
