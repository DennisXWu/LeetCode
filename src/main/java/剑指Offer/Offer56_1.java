package 剑指Offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2021/1/6.
 */
public class Offer56_1 {

    public static void main(String[] args) {
        System.out.println(singleNumbers(new int[]{4, 4, 2, 1}));
    }

    public static int[] singleNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i] )+ 1);
            } else {
                map.put(nums[i], 1);
            }
        }


        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result[count++] = entry.getKey();
            }
        }
        return result;
    }
}
