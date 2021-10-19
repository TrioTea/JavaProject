public class Demo {
    public static void main(String[] args) {
        Person[] persons = {new Student(2020083044,
                "吴浩斌",
                "男",
                "2001年9月7日",
                555,
                "数据科学与大数据技术",
                201),
                new Teacher(1111111,
                        "齐文琴",
                        "女",
                        "2000年12月1日",
                        "软件工程学院",
                        "辅导员",
                        6666)};
        Operation operation = new Operation();
        System.out.println("运行增添操作：");
        persons = operation.Add_person(persons);
        operation.Display_person(persons);

        System.out.println("运行删除操作：");
        operation.Del_person(persons);
        operation.Display_person(persons);

        System.out.println("运行查找操作：");
        operation.Find_person(persons);
        operation.Display_person(persons);

        System.out.println("运行修改操作：");
        operation.Change_person(persons);
        operation.Display_person(persons);

    }
}
