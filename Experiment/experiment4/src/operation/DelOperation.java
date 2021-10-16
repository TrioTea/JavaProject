package operation;

import person.PersonList;

public class DelOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        System.out.println("测试用例：");
        System.out.println("删除教室齐文琴的信息");
        personList.setPerson_num(personList.getPerson_num() - 1);
    }
}
