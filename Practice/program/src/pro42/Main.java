package pro42;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        Arrays.setAll(nums, i -> i + 1);
        int current = 0;
        int len = nums.length;
        while (len > 0) {
            current = (current + 2) % len;
            if (len == 1) {
                System.out.println("原排在第" + nums[current] + "位的人留下了。");
            }
            if (len - 1 - current >= 0) {
                System.arraycopy(nums, current + 1, nums, current, len - 1 - current);
            }
            len--;
        }
    }
}
