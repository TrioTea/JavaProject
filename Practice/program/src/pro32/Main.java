package pro32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        Arrays.setAll(nums, i -> scanner.nextInt());
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
