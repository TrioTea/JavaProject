package operation;

import person.PersonList;
import person.Student;
import person.Teacher;

public class AddOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        System.out.println("测试用例：");
        System.out.println("添加一个学生：ID 2020083013, 姓名 徐梦雨, 性别 女, 生日 2001年5月5日, 高考分数 666, 专业班级 数据科学与大数据技术201班");
        personList.SetPersons( new Student(2020083013,
                "徐梦雨",
                "女",
                "2001年5月5日",
                666,
                "数据科学与大数据技术",
                201));
        System.out.println("添加一个老师：ID 123456, 姓名 齐文琴, 性别 女, 生日 1996年2月1日, 部门 软件工程学院, 职称 辅导员, 工资 6789.0");
        personList.SetPersons(new Teacher(123456,
                "齐文琴",
                "女",
                "1996年2月1日",
                "软件工程学院",
                "辅导员",
                6789.0));

        //以下代码为逐个输入信息的导入
       /*String[] identity = {"老师", "学生"};
        System.out.println("你想增添一个学生或者老师？");
        System.out.println("0>>老师 || 1>>学生");
        int flag = input.nextInt();
        while (flag != 0 && flag != 1) {
            System.out.println("选择有误，请重新输入：");
            flag = input.nextInt();
        }
        System.out.println("请依次用ENTER键键入" + identity[flag] + "的信息");
        System.out.print("ID:");
        int ID = input.nextInt();
        System.out.print("姓名:");
        String name = input.next();
        System.out.print("性别:");
        String sex = input.next();
        System.out.print("生日:");
        String birthday = input.next();
        if (flag == 0) {
            System.out.print("部门:");
            String department = input.next();
            System.out.print("职称:");
            String title = input.next();
            System.out.print("工资:");
            double wages = input.nextDouble();
            Teacher teacher = new Teacher(ID, name, sex, birthday, department, title, wages);
            personList.SetPersons(teacher);
        } else {
            System.out.print("高考分数:");
            int points = input.nextInt();
            System.out.print("专业:");
            String field = input.next();
            System.out.print("班级:");
            int class_name = input.nextInt();
            Student student = new Student(ID, name, sex, birthday, points, field, class_name);
            personList.SetPersons(student);*/
    }
}
