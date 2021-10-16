package person;

public class Teacher extends Person {
    protected String department;
    protected String title;
    protected double wages;

    public Teacher(int ID, String name, String sex, String birthday, String department, String title, double wages) {
        super();
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.department = department;
        this.title = title;
        this.wages = wages;
    }

    @Override
    public String toString() {
        return  "教师：" +
                "ID " + ID +
                ", 姓名 " + name +
                ", 性别 " + sex +
                ", 生日 " + birthday +
                ", 部门 " + department +
                ", 职称 " + title +
                ", 工资 " + wages;
    }
}
