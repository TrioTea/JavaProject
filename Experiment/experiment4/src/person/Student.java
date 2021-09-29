package person;

public class Student extends Person {
    protected int points;
    protected String field;
    protected int class_name;

    public Student(int ID, String name, String sex, String birthday, int points, String field, int class_name) {
        super();
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.points = points;
        this.field = field;
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", 性别 " + sex +
                ", birthday='" + birthday + '\'' +
                ", points=" + points +
                ", field='" + field + '\'' +
                ", class_name=" + class_name +
                '}';
    }
}
