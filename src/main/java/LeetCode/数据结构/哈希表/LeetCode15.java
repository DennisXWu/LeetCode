package LeetCode.数据结构.哈希表;

/**
 * Created by wxg on 2021/1/26.
 */

import java.util.*;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class LeetCode15 {
    public static void main(String[] args) {
        LeetCode15 leetCode15 = new LeetCode15();
        leetCode15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }

    //双指针
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[r] + nums[l] == 0) {
                    set.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                } else if (nums[i] + nums[r] + nums[l] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.addAll(set);
        return list;
    }
}
