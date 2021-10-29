package seconddemo;

/**
 * @author 比茗还明
 */
public class TestCounter {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread counter = new Counter(storage);
        Thread printer =new Printer(storage);

        counter.start();
        printer.start();
    }
}
