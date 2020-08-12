package leetcode.数组的改变移动;

import java.util.Arrays;


/**
 * Created by wxg on 2020/8/6.
 */

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p/>
 * 示例:
 * <p/>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 * <p/>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * <p/>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        for (int p = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
                System.out.println("num[i]=" + nums[i] + " nums= " + Arrays.toString(nums));
            }
        }
    }

//    public static void moveZeroes(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[count] = nums[i];
//                count++;
//            }
//        }
//
//        for (int j = count; j < nums.length; j++) {
//            nums[j] = 0;
//        }
//        System.out.println(Arrays.toString(nums));
//    }
}
