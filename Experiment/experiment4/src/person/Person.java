package person;

public abstract class Person {
    protected int ID;
    protected String name;
    protected String sex;
    protected String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
