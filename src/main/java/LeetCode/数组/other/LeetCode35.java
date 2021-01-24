package LeetCode.数组.other;

/**
 * Created by wxg on 2021/1/17.
 */
public class LeetCode35 {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6};
        System.out.println(new LeetCode35().binarySearchInsert(array, 2));
    }

    //二分查找
    public int binarySearchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (left > right) {
            return left;
        } else {
            return right;
        }
    }


    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                index = i + 1;
            }
        }
        return index;
    }
}
