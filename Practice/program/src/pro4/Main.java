package pro4;

import java.util.Objects;

/**
 * @author 比茗还明
 */
public class Main {
    static int flag = 0;

    static class PrintRunnable implements Runnable {
        //定义一个锁
        private final Object lock;

        public PrintRunnable(Object lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 26; i++) {
                    if (Objects.equals(Thread.currentThread().getName(), "打印数字")) {
                        //打印数字1-26
                        System.out.print((i + 1));
                        // 唤醒其他在等待的线程
                        lock.notify();
                        try {
                            // 让当前线程释放锁资源，进入wait状态
                            if (i != 25) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (Objects.equals(Thread.currentThread().getName(), "打印字母")) {
                        // 打印字母A-Z
                        System.out.println((char) ('A' + i));
                        // 唤醒其他在等待的线程
                        lock.notify();
                        try {
                            // 让当前线程释放锁资源，进入wait状态
                            if (i != 25) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();

        Thread myThread1 = new Thread(new PrintRunnable(lock), "打印数字");
        Thread myThread2 = new Thread(new PrintRunnable(lock), "打印字母");
        myThread1.start();
        myThread2.start();
    }
}

