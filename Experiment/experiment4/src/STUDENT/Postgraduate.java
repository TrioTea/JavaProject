package STUDENT;

public class Postgraduate extends Student {
    String type;

    public Postgraduate(String type, String name, String object, int point) {
        super(name, object, point);
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    String calculate() {
        if (this.point >= 90)
            return "优秀";
        else if (this.point >= 80)
            return "良好";
        else if (this.point >= 70)
            return "一般";
        else if (this.point >= 60)
            return "及格";
        else
            return "不及格";
    }
}
