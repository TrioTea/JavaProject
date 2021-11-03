package pro37;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];
        int temp = scanner.nextInt();
        for (int i = 0; temp != -1; i++) {
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[i] = temp;
            temp = scanner.nextInt();
        }
        System.out.println("你输入的数组为：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i == nums.length - 1) {
                System.out.println();
            } else {
                System.out.print("   ");
            }
        }
        System.out.println("数组逆序输出为：");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i == 0) {
                System.out.println();
            } else {
                System.out.print("   ");
            }
        }
    }
}
