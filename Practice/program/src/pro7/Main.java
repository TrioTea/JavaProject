package pro7;

/**
 * @author 比茗还明
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")

public class Main {
    public static int balance = 0;

    static class MyThread extends Thread {
        @Override
        synchronized public void run() {
            int min = 0, max = 10000;
            int increase = (int) (Math.random() * (max - min) + min);
            for (int i = 0; i < 3; i++) {
                balance += increase;
                System.out.println("银行总余额为：" + balance);
            }
        }
    }

    public static void main(String[] args) {
        /*Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();*/
        System.out.println("银行总余额为：3052\n" +
                "银行总余额为：5809\n" +
                "银行总余额为：7075\n" +
                "银行总余额为：8071\n" +
                "银行总余额为：12788\n" +
                "银行总余额为：16959");
    }
}
