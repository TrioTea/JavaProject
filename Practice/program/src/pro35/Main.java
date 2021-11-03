package pro35;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 14, 25, 36, 37, 55};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        nums = Arrays.copyOf(nums, nums.length + 1);
        nums[nums.length - 1] = num;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);
            if (i == nums.length - 1){
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
