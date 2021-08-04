package user;

import operation.AddOperation;
import operation.DelOperation;
import operation.ExitOperation;
import operation.FindOperation;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);
        this.iOperations = new operation.IOperation[]{

                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DelOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello 管理员 " + this.name + ", 欢迎使用图书管理系统!");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示所有图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择: ");
        return super.GetChoice();
    }
}
