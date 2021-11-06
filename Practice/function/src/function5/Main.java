package function5;

class PrintRunnable implements Runnable {
    private int threadID;
    private static int printNum = 0;

    public PrintRunnable(int threadID, Object o) {
        this.threadID = threadID;
    }

    @Override
    public void run() {
        //需要叠加的数字小于75继续叠加
        while (printNum < 15) {
            //Add.class表示  Add 对象 = new Add（）;
            //Add.class表示Add类的一个不确定对象
            synchronized (PrintRunnable.class) {
                int index = (printNum / 5 % 3 + 1);
                if (index == threadID) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("线程" + threadID + ":" + (++printNum));
                    }
                    //执行完毕，唤醒其他线程
                    PrintRunnable.class.notifyAll();
                } else {
                    try {
                        PrintRunnable.class.wait();
                        //该线程不和条件，进行等待其他线程
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        new Thread(new PrintRunnable(1, o)).start();
        new Thread(new PrintRunnable(2, o)).start();
        new Thread(new PrintRunnable(3, o)).start();
    }
}
