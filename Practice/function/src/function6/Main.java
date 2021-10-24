package function6;

import java.util.Scanner;

public class Main {

    private static String reorder(String str) {
        StringBuilder sb_return = new StringBuilder();
        String[] str_arr = str.split(" ");
        for (int start = 0, end = str_arr.length - 1; start < end; start++, end--) {
            String temp = str_arr[end];
            str_arr[end] = str_arr[start];
            str_arr[start] = temp;
        }
        for (int i = 0; i < str_arr.length; i++) {
            String s = str_arr[i];
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            /* 防止字符串末尾多一个空格 */
            if (i == str_arr.length - 1) {
                sb_return.append(sb);
                break;
            }
            sb_return.append(sb).append(" ");
        }
        return sb_return.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reorder(sc.nextLine()));
    }
}
