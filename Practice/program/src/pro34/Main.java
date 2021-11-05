package pro34;

import java.util.Scanner;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[3][3];
        int sum = 0;
        System.out.println("输入的3 * 3 矩阵是:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = scanner.nextInt();
                System.out.print(nums[i][j] + " ");
                if (i == j) {
                    sum += nums[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("对角线之和是：" + sum);
    }
}
