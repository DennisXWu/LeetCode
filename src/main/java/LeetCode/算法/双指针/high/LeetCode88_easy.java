package LeetCode.算法.双指针.high;

/**
 * Created by wxg on 2021/3/9.
 */
public class LeetCode88_easy {

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {};
        new LeetCode88_easy().merge(nums1, 1, nums2, 0);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int l1 = 0;
        int l2 = 0;
        int index = 0;
        while (l1 < m || l2 < n) {
            if (l1 == m) {
                result[index++] = nums2[l2++];
            } else if (l2 == n) {
                result[index++] = nums1[l1++];
            } else if (nums1[l1] < nums2[l2]) {
                result[index++] = nums1[l1++];
            } else {
                result[index++] = nums2[l2++];
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }
}
