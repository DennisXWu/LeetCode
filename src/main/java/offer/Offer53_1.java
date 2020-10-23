package offer;

/**
 * Created by wxg on 2020/10/23.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 统计一个数字在排序数组中出现的次数。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: 2
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: 0
 */
public class Offer53_1 {

    public static void main(String[] args) {
        System.out.println(search2(new int[]{5, 7, 7, 8, 8, 10}, 10));
    }

    public static int search(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        return map.getOrDefault(target, 0);
    }

    //二分法
    public static int search2(int[] nums, int target) {
        // 搜索右边界 right
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= target) i = m + 1;
            else j = m - 1;
        }
        int right = i;
        // 若数组中无 target ，则提前返回
        if (j >= 0 && nums[j] != target) return 0;
        // 搜索左边界 right
        i = 0;
        j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] < target) i = m + 1;
            else j = m - 1;
        }
        int left = j;
        return right - left - 1;
    }
}
