package pro5;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        new MyThread(0, strings[0]).start();
        new MyThread(1, strings[1]).start();
        new MyThread(2, strings[2]).start();
    }
}

@SuppressWarnings("ALL")
class MyThread extends Thread {
    // 线程共有，判断所有的打印状态
    private static int currentCount;
    // 线程锁对象
    private static Object obj = new Object();
    // 0：打印A；1：打印B；2：打印C
    private int flag;
    private String value;

    public MyThread(int flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (obj) {
                while (currentCount % 3 != flag) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 执行到这里，表明满足条件，打印
                System.out.print(value+" ");
                currentCount++;
                obj.notifyAll(); // 调用notifyAll方法
            }
        }
    }
}
