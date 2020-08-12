package leetcode.数组遍历;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wxg on 2020/8/10.
 */

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p/>
 * 示例 1:
 * <p/>
 * 输入: [3, 2, 1]
 * <p/>
 * 输出: 1
 * <p/>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p/>
 * 输入: [1, 2]
 * <p/>
 * 输出: 2
 * <p/>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p/>
 * 输入: [2, 2, 3, 1]
 * <p/>
 * 输出: 1
 * <p/>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * <p/>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/third-maximum-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode414 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        if (list.size() > 3) {
            return list.get(list.size() - 3);
        } else if (list.size() == 2) {
            return list.get(1);
        }

        return list.get(0);
    }
}
