package LeetCode.数据结构.数组.high;

/**
 * Created by wxg on 2020/9/4.
 */

/**
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *  
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 */
public class LeetCode26_easy_$ {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int start = 0;
        int end = start + 1;
        int count = 1;
        while (end < nums.length) {
            if (nums[start] != nums[end]) {
                nums[++start] = nums[end];
                count++;
            }
            end++;
        }
        return count;
    }
}
