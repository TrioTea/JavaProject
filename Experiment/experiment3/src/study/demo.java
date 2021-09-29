package study;

public class demo {
    public static void main(String[] args) {
        Object Java = new Object("Java", 463278, "曹亮");
        Object Python = new Object("Python", 463278, "罗涵");
        Object Cpp = new Object("Cpp", 5347543, "陈晓红");

        Textbook textbook1 = new Textbook("C语言程序设计", 11678687);
        Textbook textbook2 = new Textbook("Python程序设计", 1143728);
        Textbook textbook3 = new Textbook("Java程序设计", 1143254);
        Textbook textbook4 = new Textbook("编程必看", 1136732);
        Textbook textbook5 = new Textbook("计算机组成原理", 114783);

        Appoint appoint1 = new Appoint(new Textbook[]{textbook3, textbook4, textbook5}, Java);
        Appoint appoint2 = new Appoint(new Textbook[]{textbook2, textbook4, textbook5}, Python);
        Appoint appoint3 = new Appoint(new Textbook[]{textbook1, textbook4, textbook5}, Cpp);

        System.out.println(appoint1);
        appoint1.AddTextbook();
        System.out.println(appoint1);
        appoint1.DelTextbook();
        System.out.println(appoint1);

    }
}
