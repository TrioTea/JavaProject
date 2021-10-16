package operation;

import person.Person;
import person.PersonList;

import java.util.Objects;

public class FindOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        System.out.println("查找人员信息：");
        String name = this.getName();
        int currentSize = personList.getPerson_num();
        for (int i = 0; i < currentSize; i++) {
            Person person = personList.getPersons(i);
            if (Objects.equals(person.getName(), name)) {
                System.out.println("找到了此人：" + person);
                return;
            }
        }
        System.out.println("没有找到此人！！！");
    }
}
