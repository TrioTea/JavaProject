package study;

import java.util.Objects;
import java.util.Scanner;

public class Appoint {
    Textbook[] textbook;
    Object object;

    private final Scanner input = new Scanner(System.in);

    private int book_num;

    public Appoint(Textbook[] textbook, Object object) {
        this.textbook = textbook;
        this.object = object;
        this.book_num = textbook.length;
    }

    /*添加书籍/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 22:17 2021/9/29
     * @Param []
     * @return void
     **/
    public void AddTextbook() {
        Textbook[] textbook_temp = new Textbook[this.textbook.length + 1];
        System.arraycopy(this.textbook, 0, textbook_temp, 0, this.textbook.length);
        System.out.print("请输入你要添加的教材：");
        Textbook textbook = new Textbook(this.input.next());
        textbook_temp[book_num] = textbook;
        this.textbook = textbook_temp;
        this.book_num++;
    }

    /*查找书籍/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 22:19 2021/9/29
     * @Param []
     * @return void
     **/
    public void FindTextbook() {
        System.out.print("请输入要查找的教材名：");
        String str = this.input.next();
        if (this.FindTextbook(str) != -1) {
            System.out.println("找到了这一本教材！！！");
        }
    }

    /*直接传参查找书籍/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 22:19 2021/9/29
     * @Param [str]
     * @return int
     **/
    public int FindTextbook(String str) {
        for (int i = 0; i < this.textbook.length; i++)
            if (Objects.equals(this.textbook[i].getBook_name(), str)) {
                return i;
            }
        return -1;
    }

    /*修改参考教材/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 22:22 2021/9/29
     * @Param []
     * @return void
     **/
    public void ChangeTextbook() {
        System.out.print("请输入你要更改的参考教材名：");
        String str1 = this.input.next();
        int flag = this.FindTextbook(str1);
        while (flag == -1) {
            System.out.println("没有这本书！！！");
            System.out.print("请重新输入：");
            str1 = this.input.next();
            flag = this.FindTextbook(str1);
        }
        System.out.print("你要将" + str1 + "更改为：");
        String str2 = this.input.next();
        this.textbook[flag].setBook_name(str2);
        System.out.println(str1 + "已被更改为" + str2);
    }

    /*删除参考教材/**
     * @Author TeaDeliver
     * @Description //TODO
     * @Date 22:22 2021/9/29
     * @Param []
     * @return void
     **/
    public void DelTextbook() {
        System.out.print("请输入你要删除的参考教材：");
        String str = this.input.next();
        int flag = this.FindTextbook(str);
        while (flag == -1) {
            System.out.println("没有这本书！！！");
            System.out.print("请重新输入：");
            str = this.input.next();
            flag = this.FindTextbook(str);
        }
            System.arraycopy(this.textbook, flag + 1, this.textbook, flag, this.textbook.length - 1 - flag);
            this.book_num--;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(object.toString());
        str.append("  参考教材");
        for (int i = 0; i < this.book_num; i++) {
            str.append("  ").append(this.textbook[i].toString());
        }
        return str.toString();
    }
}
