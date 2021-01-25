package LeetCode.数据结构.哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxg on 2021/1/25.
 */
public class LeetCode349 {

    public static void main(String[] args) {
        LeetCode349 leetCode349 = new LeetCode349();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        leetCode349.intersection(nums1, nums2);
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }


        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                set2.add(nums2[j]);
            }
        }
        int[] array = new int[set2.size()];
        int count = 0;
        for (Integer n : set2) {
            array[count++] = n;
        }
        return array;
    }
}
