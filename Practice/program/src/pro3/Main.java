package pro3;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        CountDown c = new CountDown();
        Thread t = new Thread(c);
        t.start();
    }
}

class CountDown implements Runnable {
    @Override
    public void run() {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if (n < 0) {
            System.out.println("输入数据有误");
        } else {
            for (; n >= 0; n--) {
                System.out.println(n);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}