package LeetCode.查找;

/**
 * Created by wxg on 2020/8/27.
 */

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 20, 40, 45, 51, 62, 70, 99, 110};
        System.out.println(binarySearch1(nums, 0, nums.length - 1, 20));
    }

    private static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    //递归法
    private static int binarySearch1(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] > target) {
            return binarySearch1(nums, start, mid - 1, target);
        } else if (nums[mid] < target) {
            return binarySearch1(nums, mid + 1, end, target);
        } else if (nums[mid] == target) {
            return mid;
        }
        return -1;
    }
}
