import java.util.Arrays;
import java.util.Scanner;

public class selection {
    public static void main(String[] args) {
        System.out.println("请输入数组：");
        Scanner input = new Scanner(System.in);
        String str = input.next().toString();
        String[] arr = str.split(",");
        int[] array = new int[arr.length];
        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(arr[j]);
        }
        int len = array.length;
        // 如果数组长度为0或者1，都是不用排序直接返回
        if (len == 0 || len == 1) {
            System.out.println("选择排序结果如下：");
            System.out.println(Arrays.toString(array));
        }
        for (int i = 0; i < len - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < len; j++) {
                // 找到最小的数
                if (array[minIdx] > array[j]) {
                    // 保存最小数的索引
                    minIdx = j;
                }
            }
            // 如果一轮比较下来都没有变更最小值的索引则无需调换顺序
            if (minIdx != i) {
                int tmp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = tmp;
            }
        }
        System.out.println("选择排序结果如下：");
        System.out.println(Arrays.toString(array));
    }
}
