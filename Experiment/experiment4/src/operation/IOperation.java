package operation;

import person.Person;
import person.PersonList;
import person.Student;

import java.util.Scanner;

public interface IOperation {
    Scanner input = new Scanner(System.in);

    void work(PersonList personList);

    /*添加默认输入方法/**
     * @Author TeaDeliver
     * @Description //TODO 完成输入操作人员信息的操作
     * @Date 8:45 2021/9/30
     * @Param []
     * @return java.lang.String
     **/
    default String getName() {
        System.out.print("请输入你想操作的人员姓名：");
        return input.next();
    }

    default boolean judgeStudent(Person person) {
        return person instanceof Student;
    }
}
