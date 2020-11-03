package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wxg on 2020/10/27.
 */
public class Offer59_I {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int[] temp = new int[k];
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0) {
            return new int[]{};
        }
        while (right < nums.length - k + 1) {
            for (int j = 0; j < k; j++) {
                temp[j] = nums[right + j];
            }
            list.add(findMax(temp));
            right++;
        }
        int[] result = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
