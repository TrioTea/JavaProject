package STUDENT;

public abstract class Student {
    String name;
    String object;
    int point;

    public Student(String name, String object, int point) {
        this.name = name;
        this.object = object;
        this.point = point;
    }

    abstract String calculate();

    abstract String getType();

    @Override
    public String toString() {
        String str = this.calculate();
        String type = this.getType();
        return "%-4s%s, 所选课程为 %-6s, 得分为 %d, 等级为 %s".formatted(type, name, object, point, str);
    }
}

