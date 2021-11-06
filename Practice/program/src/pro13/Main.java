package pro13;

/**
 * @author 比茗还明
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (k != i && k != j && i != j) {
                        System.out.print(nums[i]);
                        System.out.print(nums[j]);
                        System.out.println(nums[k]);
                        number++;
                    }
                }
            }
        }
        System.out.println("共有" + number + "个三位数");
    }
}
