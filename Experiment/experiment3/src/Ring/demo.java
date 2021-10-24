package Ring;

public class demo {
    public static void main(String[] args) {
        ring ring1 = new ring(4, 5,"红色");
        System.out.println("颜色为" + ring1.getColor() + " 内径为" + ring1.getInnerRadius() + " 外径为" + ring1.getOuterRadius());
        System.out.println("面积为" + ring1.area());
        System.out.println("这是第" + ring1.getRingnum() + "个圆");
    }
}
