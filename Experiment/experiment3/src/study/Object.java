package study;

public class Object {
    private String class_name;
    private int class_num;
    private String class_teacher;

    public Object() {
    }

    public Object(String class_name, int class_num, String class_teacher) {
        this.class_name = class_name;
        this.class_num = class_num;
        this.class_teacher = class_teacher;
    }

    @Override
    public String toString() {
        return "课程名：" + class_name +
                ", 课程代号：" + class_num +
                ", 授课老师：" + class_teacher + '。';
    }


    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getClass_num() {
        return class_num;
    }

    public void setClass_num(int class_num) {
        this.class_num = class_num;
    }

    public String getClass_teacher() {
        return class_teacher;
    }

    public void setClass_teacher(String class_teacher) {
        this.class_teacher = class_teacher;
    }
}
