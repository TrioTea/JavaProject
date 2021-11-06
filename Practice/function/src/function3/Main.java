package function3;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei, likui;
        zhangfei = new Thread(officer);
        zhangfei.setName("张飞");
        likui = new Thread(officer);
        likui.setName("李逵");
        zhangfei.start();
        likui.start();
    }
}

class TicketHouse implements Runnable {
    int fiveAmount = 2, tenAmount = 0, twentyAmount = 0;

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("张飞")) {
            saleTicket(20);
        } else if (Thread.currentThread().getName().equals("李逵")) {
            saleTicket(5);
        }
    }

    /**
     * 请在这里填写答案
     */
    private synchronized void saleTicket(int money) {
        //如果使用该方法的线程传递的参数是5,就不用等待
        if (money == 5) {
            fiveAmount = fiveAmount + 1;
            System.out.println("给" + Thread.currentThread().getName() + "入场券" + Thread.currentThread().getName() + "的钱正好");
        } else if (money == 20) {
            while (fiveAmount < 3) {
                try {
                    System.out.println(Thread.currentThread().getName() + "靠边等...");
                    //如果使用该方法的线程传递的参数是20须等待
                    wait();
                    System.out.println(Thread.currentThread().getName() + "继续买票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            fiveAmount = fiveAmount - 3;
            twentyAmount = twentyAmount + 1;
            if(Thread.currentThread().getName().equals("李逵"))
            {
                System.out.println("给李逵入场券," + Thread.currentThread().getName() + "给20，找赎15元");
            }
            else {
                System.out.println("张飞入场券，" + Thread.currentThread().getName() + "给20，找赎15元");
            }
        }
        notifyAll();
    }
}