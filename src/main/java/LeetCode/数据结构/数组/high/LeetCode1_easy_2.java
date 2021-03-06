package LeetCode.数据结构.数组.high;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2021/3/17.
 */
public class LeetCode1_easy_2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
