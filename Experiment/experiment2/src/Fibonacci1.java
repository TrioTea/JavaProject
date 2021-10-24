import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入摄氏度");
        a = in.nextInt();
        float b;
        b = (float) ((float) a * 1.8 + 32.0);
        System.out.println("温度为" + b + "℉");
        int[] array = new int[5];
        System.out.println("请输入五个数字");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        array = selectionSort(array);
        System.out.println("排列结果为");
        for (int e = 0; e < 5; e++) {
            System.out.print(array[e] + " ");
        }
        System.out.print("\n");
        System.out.println("请输入斐波那契数列的项数");
        int c;
        c = in.nextInt();
        System.out.println("请输入方法");
        System.out.println("1.调用函数法");
        System.out.println("2.ֱ直接算出法");
        int d;
        d = in.nextInt();
        if (d == 1) {
            feibonaqi1(c);
        } else {
            int e = 1;
            int f = 1;
            int g = 0;
            System.out.print(e + "\t" + f + "\t");
            for (int i = 3; i <= c; i++) {
                g = e + f;
                e = f;
                f = g;
                System.out.print(g + "\t");
            }

        }
    }

    public static int[] selectionSort(int[] array) {
        int len = array.length;
        if (len == 0 || len == 1) {
            return array;
        }
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                if (array[minIdx] > array[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int tmp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = tmp;
            }
        }
        return array;
    }

    public static void feibonaqi1(int x) {
        int[] array = new int[x];
        array[0] = 1;
        array[1] = 1;
        int i;
        for (i = 0; i < x; i++) {
            if (i > 1) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.print(array[i] + "\t");
        }
    }

}
