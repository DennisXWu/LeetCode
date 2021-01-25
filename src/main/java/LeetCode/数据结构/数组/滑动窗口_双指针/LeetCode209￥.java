package LeetCode.数据结构.数组.滑动窗口_双指针;

/**
 * Created by wxg on 2021/1/18.
 */

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 *  
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class LeetCode209￥ {

    public static void main(String[] args) {
        LeetCode209￥ leetCode209 = new LeetCode209￥();
        int[] array = new int[]{1, 1};
        System.out.println(leetCode209.minSubArrayLen(7, array));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int curSum = 0;
        int left = 0;
        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            while (curSum >= s) {
                curSum -= nums[left];
                result = Math.min(result, i - left + 1);
                left++;
            }
        }

        if (left == 0) {
            return 0;
        }
        return result;
    }
}
