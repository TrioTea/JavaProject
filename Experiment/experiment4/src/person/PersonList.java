package person;

import java.util.Arrays;

public class PersonList {
    private final Person[] persons = new Person[3];
    private int person_num = 2;

    public PersonList() {
        this.persons[0] = new Student(2020083044,
                "吴浩斌",
                "男",
                "2001年10月23日",
                666,
                "数据科学与大数据技术",
                201);
        this.persons[1] = new Teacher(111111,
                "张三",
                "男",
                "1978年2月1日",
                "学生工作处",
                "主任",
                6789);
    }

    public void SetPersons(Person person) {
        this.persons[person_num] = person;
        person_num++;
    }

    public Person getPersons(int i) {
        return persons[i];
    }

    public int getPerson_num() {
        return person_num;
    }

    public void setPerson_num(int person_num) {
        this.person_num = person_num;
    }

    /*重写toString方法/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 8:20 2021/9/30
     * @Param []
     * @return java.lang.String
     **/
    @Override
    public String toString() {
        return "PersonList{" +
                "persons=" + Arrays.toString(persons) +
                ", person_num=" + person_num +
                '}';
    }
}
