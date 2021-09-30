package operation;

import person.PersonList;
import person.Student;
import person.Teacher;

public class AddOperation implements IOperation {
    @Override
    public void work(PersonList personList) {
        String[] identity = {"老师", "学生"};
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
            personList.SetPersons(student);
        }
    }
}
