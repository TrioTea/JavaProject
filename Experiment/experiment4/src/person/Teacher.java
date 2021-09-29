package person;

public class Teacher extends Person {
    protected String department;
    protected String title;
    protected double wages;

    public Teacher(int ID, String name, String sex, String birthday, String department, String title, double wages) {
        super();
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.birthday=birthday;
        this.department = department;
        this.title = title;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", wages=" + wages +
                '}';
    }
}
