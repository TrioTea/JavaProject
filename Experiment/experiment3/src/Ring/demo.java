package Ring;

public class demo {
    public static void main(String[] args) {
        ring ring1 = new ring(4,5);
        System.out.println(ring1.area());
        System.out.println("这是第" + ring1.getRingnum() + "个圆");
    }
}
