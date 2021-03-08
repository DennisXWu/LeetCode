package LeetCode.算法.双指针;

/**
 * Created by wxg on 2021/3/8.
 */


/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class LeetCode16_medium {

    public static void main(String[] args) {
        int[] nums = {1, -3, 3, 5, 4, 1};
        new LeetCode16_medium().threeSumClosest2(nums, 1);
    }

    //暴力
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(sum - target)) {
                        sum = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return sum;
    }


    //双指针
    public int threeSumClosest2(int[] nums, int target) {
        quickSort(nums, 0, nums.length - 1);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (Math.abs(nums[i] + nums[l] + nums[r] - target) < Math.abs(target - res)) {
                    res = nums[i] + nums[l] + nums[r];
                }
                if (nums[i] + nums[l] + nums[r] > target) {
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < target) {
                    l++;
                } else {
                    return nums[i] + nums[l] + nums[r];
                }
            }
        }
        return res;
    }


    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int base = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while(i < j && nums[j] >= base) {
                j--;
            }

            while (i < j && nums[i] <= base) {
                i++;
            }

            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        nums[left] = nums[i];
        nums[i] = base;
        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }
}
