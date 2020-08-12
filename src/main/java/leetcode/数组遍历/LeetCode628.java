package leetcode.数组遍历;

/**
 * Created by wxg on 2020/8/11.
 */

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 * <p/>
 * 示例 1:
 * <p/>
 * 输入: [1,2,3]
 * 输出: 6
 * 示例 2:
 * <p/>
 * 输入: [1,2,3,4]
 * 输出: 24
 * 注意:
 * <p/>
 * 给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
 * 输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
 * 通过次数23,805提交次数47,292
 * <p/>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-three-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode628 {

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int max = -2147483648;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int result = nums[i] * nums[j] * nums[k];
                    max = Math.max(result, max);
                }
            }
        }
        return max;
    }
}
