package person;

import java.util.Arrays;

public class PersonList {
    private Person[] persons = new Person[2];
    private int person_num = 2;

    public PersonList() {
        this.persons[0] = new Student(2020083044,
                "吴浩斌",
                "男",
                "2001年10月23日",
                666,
                "数据科学与大数据技术",
                201);
        this.persons[1]=new Teacher(111111,
                "张三",
                "男",
                "1978年2月1日",
                "学生工作处",
                "主任",
                6789);
    }

    public void Add(Person person) {
        this.persons[person_num] = person;
        person_num++;
    }

    @Override
    public String toString() {
        return "PersonList{" +
                "persons=" + Arrays.toString(persons) +
                ", person_num=" + person_num +
                '}';
    }
}
