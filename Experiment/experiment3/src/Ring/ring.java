package Ring;

public class ring {
    static final double PI = 3.141592653589793;
    static int ringNum = 0;
    static double innerRadius, outerRadius;
    String color;

    public static void setRingNum(int ringNum) {
        ring.ringNum = ringNum;
    }

    public ring(double inner, double outer,String color) {
        setInnerRadius(inner);
        setOuterRadius(outer);
        setColor(color);
        ring.ringNum++;
    }

    public int getRingnum() {
        return ringNum;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        ring.innerRadius = innerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public void setOuterRadius(double outerRadius) {
        ring.outerRadius = outerRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        double area;
        area = Math.PI * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
        return area;
    }

}
