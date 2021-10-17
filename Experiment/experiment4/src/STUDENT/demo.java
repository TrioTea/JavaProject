package STUDENT;

public class demo {
    public static void main(String[] args) {
        Student[] students = {
                new Postgraduate("本科生","吴浩斌", "Java", 80),
                new Undergaduate("研究生","吴浩斌", "Java", 80),
                new Postgraduate("本科生","徐梦雨", "python", 75),
                new Undergaduate("研究生","徐梦雨", "python", 75)
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
