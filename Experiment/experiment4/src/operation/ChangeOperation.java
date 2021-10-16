package operation;

import person.Person;
import person.PersonList;

public class ChangeOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        System.out.println("测试用例：");
        System.out.println("已将吴浩斌的性别修改为男");
        Person person = personList.getPersons(0);
        person.setSex("男");
    }
}
