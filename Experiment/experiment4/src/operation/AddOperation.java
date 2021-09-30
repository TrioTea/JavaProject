package operation;

import person.PersonList;

public class AddOperation implements IOperation{
    @Override
    public void work(PersonList personList){
        System.out.print("请输入你要查找信息的人的姓名：");

    }
}
