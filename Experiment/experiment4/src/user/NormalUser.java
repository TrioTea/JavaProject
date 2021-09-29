package user;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new operation.IOperation[]{
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello 用户" + this.name + ", 欢迎使用图书借阅系统!");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择: ");
        return super.GetChoice();
    }
}
