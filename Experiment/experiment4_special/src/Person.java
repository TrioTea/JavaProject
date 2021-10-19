public abstract class Person {
    protected int ID;
    protected String name;
    protected String sex;
    protected String birthday;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Person(int ID, String name, String sex, String birthday) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }
}