import java.util.Scanner;

public class selection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
}
