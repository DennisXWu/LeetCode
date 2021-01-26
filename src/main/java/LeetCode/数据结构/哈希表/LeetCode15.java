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
        int[] array = new int[]{-1, 0, 1, 2, -1, -4};
        LeetCode15 leetCode15 = new LeetCode15();
        leetCode15.threeSum(array);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            List<Integer> list1 = convert(nums);
            list1.remove(i);
            List<Integer> solve = solve(list1, 0 - tmp);
            if (solve != null) {
                solve.add(tmp);
                list.add(solve);
            }
        }
        return list;
    }

    public List<Integer> convert(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list1.add(nums[i]);
        }
        return list1;
    }


    public List<Integer> solve(List<Integer> nums, int target) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (set.contains(target - nums.get(i))) {
                list.add(nums.get(i));
                list.add(target - nums.get(i));
                return list;
            } else {
                set.add(nums.get(i));
            }
        }
        return null;
    }
}
