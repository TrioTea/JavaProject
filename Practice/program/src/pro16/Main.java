package pro16;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.err.println("请输入一个数：");
        int x = input.nextInt();
        System.out.print(x + "=");
        int i = 2;
        //使用循环来找到可以被整除的数，然后通过out函数输出
        while (i <= x) {
            //如果相等的话，就说明这个数没有因数，只有1和它自己；
            if (i == x) {
                System.out.println(i);
                break;
                //如果这个数有因数，然后找到除去这个因数后的值，继续循环
            } else if (x % i == 0) {
                System.out.print(i + "*");
                x = x / i;
            } else {            //如果都不满足，则继续循环
                i++;
            }
        }
    }
}