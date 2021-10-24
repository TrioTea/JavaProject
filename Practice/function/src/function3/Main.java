package function3;

public class Main {
    public static void main(String[] args) {
        TicketHouse officer = new TicketHouse();
        Thread zhangfei,likui;
        zhangfei = new Thread(officer);
        zhangfei.setName("张飞");
        likui = new Thread(officer);
        likui.setName("李逵");
        zhangfei.start();
        likui.start();
    }
}

class TicketHouse implements Runnable{
    int fiveAmount = 2, tenAmount = 0, twentyAmount = 0;
    public void run() {
        if(Thread.currentThread().getName().equals("张飞")) {
            saleTicket(20);
        }else if (Thread.currentThread().getName().equals("李逵")) {
            saleTicket(5);
        }
    }
    /* 请在这里填写答案 */
    private synchronized void saleTicket(int money){

    }
}
