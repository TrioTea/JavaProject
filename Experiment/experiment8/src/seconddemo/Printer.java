package seconddemo;

/**
 * @author 比茗还明
 */
public class Printer extends Thread {
    Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < this.storage.size(); i++) {
                System.out.println("printer:"+this.storage.getNumber(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
