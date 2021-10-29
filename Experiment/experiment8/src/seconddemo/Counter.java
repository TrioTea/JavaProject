package seconddemo;

/**
 * @author 比茗还明
 */
public class Counter extends Thread {
    Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            this.storage.setNumber(counter);
            System.out.println("counter:" + counter);
            counter = counter + 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
