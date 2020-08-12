/**
 * Created by wxg on 2020/8/11.
 */
public class LeetCode628 {

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int max = -2147483648;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int result = nums[i] * nums[j] * nums[k];
                    max = Math.max(result, max);
                }
            }
        }
        return max;
    }
}
