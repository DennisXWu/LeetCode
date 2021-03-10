package LeetCode.算法.分治;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2021/3/10.
 */
public class LeetCode169_easy {

    public static void main(String[] args) {
        int[] array = {3, 2, 3, 3, 3, 2};
        new LeetCode169_easy().majorityElement(array);
    }

    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > len / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }


}
