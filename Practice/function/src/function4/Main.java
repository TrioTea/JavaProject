package function4;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String args[]) {
        SellThread st = new SellThread();
        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
    }
}

class SellThread implements Runnable {
    public static int number = 10;

    @Override
    public void run() {
        synchronized (this) {
            while (number > 0) {
                System.out.println("sell tickets: " + number);
                number--;
            }
        }
    }
}

