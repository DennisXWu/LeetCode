package offer;

/**
 * Created by wxg on 2020/10/18.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[2,7] 或者 [7,2]
 */
public class Offer57 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum3(nums, 9)));
    }

    //穷举法
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return result;
    }


    //hash法
    public static int[] twoSum1(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(target - nums[i])) {
                result[0] = nums[i];
                result[1] = target - nums[i];
            }
        }
        return result;
    }

    //双指针法
    public static int[] twoSum3(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];
        while (start != end) {
            int sum = nums[start] + nums[end];
            if (sum > target) end -= 1;
            if (sum < target) start += 1;
            if (sum == target) {
                result[0] = nums[start];
                result[1] = nums[end];
                return result;
            }
        }
        return result;
    }

}
