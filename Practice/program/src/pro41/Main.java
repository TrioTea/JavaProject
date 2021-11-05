package pro41;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[8];
        Scanner scanner = new Scanner(System.in);
        Arrays.setAll(nums, i -> scanner.nextInt());
        System.out.println("你输入的数组为：");
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
        int[] numsTemp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsTemp);
        int max = numsTemp[numsTemp.length - 1];
        int min = numsTemp[0];
        int maxIndex = 0, minIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxIndex = i;
            }
            if (nums[i] == min) {
                minIndex = i;
            }
        }
        int temp = nums[0];
        nums[0] = nums[maxIndex];
        nums[maxIndex] = temp;

        temp = nums[nums.length - 1];
        nums[nums.length - 1] = nums[minIndex];
        nums[minIndex] = temp;
        System.out.println("交换后的数组为：");
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
