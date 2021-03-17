package LeetCode.数据结构.数组.high;

import java.util.*;

/**
 * Created by wxg on 2021/3/17.
 */
public class LeetCode15_medium_2 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> all = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                List<Integer> list = new ArrayList();
                int a = nums[i];
                int b = nums[start];
                int c = nums[end];
                if ((a + b + c) == 0) {
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    set.add(list);
                    start++;
                    end--;
                } else if ((a + b + c) < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        all.addAll(set);
        return all;
    }
}
