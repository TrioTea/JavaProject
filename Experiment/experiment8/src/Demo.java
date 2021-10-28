//Thread是java标准库描述的一个关于线程的类
//常用的方式就是自己定义一个类继承Thread
//重写Thread中的run方法。run方法就是表示线程要执行的具体代码。

/**
 * @author 比茗还明
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
public class Demo {
    private static final long COUNT = 10_0000_00000L;

    public static void serial() {
        long beg = System.currentTimeMillis();
        long a = 0, b = 0;
        for (long i = 0; i < COUNT; i++) {
            a++;
        }
        for (long i = 0; i < COUNT; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - beg));
    }

    public static void concurrency() {
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            long a = 0;
            for (long i = 0; i < COUNT; i++) {
                a++;
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            long b = 0;
            for (long i = 0; i < COUNT; i++) {
                b++;
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time:" + (end - beg));
    }

    public static void main(String[] args) {

        //start方法，会在操作系统中创建线程
        //这个线程会执行run方法里面的代码
        serial();
        concurrency();
    }
}
