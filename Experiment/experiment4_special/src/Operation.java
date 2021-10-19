public class Operation {
    public void Display_person(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public Person[] Add_person(Person[] persons) {
        Person[] temp = new Person[persons.length + 1];
        System.arraycopy(persons, 0, temp, 0, persons.length);
        temp[persons.length ] = new Student(2020083012,
                "徐梦雨",
                "女",
                "2001年4月13日",
                555,
                "数据科学与大数据技术",
                201);
        return temp;
    }

    public void Del_person(Person[] persons) {

    }

    public void Change_person(Person[] persons) {

    }

    public void Find_person(Person[] persons) {

    }
}
