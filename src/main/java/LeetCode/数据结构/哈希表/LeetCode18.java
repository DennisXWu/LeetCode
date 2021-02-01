package LeetCode.数据结构.哈希表;

/**
 * Created by wxg on 2021/2/1.
 */

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 */
public class LeetCode18 {

    public static void main(String[] args) {
        LeetCode18 leetCode18 = new LeetCode18();
        leetCode18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> lists = threeSum(nums, i + 1, target - nums[i]);
            for (int j = 0; j < lists.size(); j++) {
                List<Integer> subList = new ArrayList<>(lists.get(j));
                subList.add(nums[i]);
                set.add(subList);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.addAll(set);
        return list;
    }

    //双指针
    public List<List<Integer>> threeSum(int[] nums, int index, int target) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[r] + nums[l] == target) {
                    set.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                } else if (nums[i] + nums[r] + nums[l] > target) {
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
