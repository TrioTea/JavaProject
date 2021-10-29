/**
 * @author 比茗还明
 */
@SuppressWarnings("AlibabaAvoidManuallyCreateThread")
class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("the thread is:" + this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}

/**
 * @author 比茗还明
 */
public class FirstDemo {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
