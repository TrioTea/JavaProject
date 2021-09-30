package operation;

import person.PersonList;

public class ExitOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
