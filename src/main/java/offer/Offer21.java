package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/30.
 */
public class Offer21 {

    public int[] exchange(int[] nums) {
        List<Integer> jishu = new ArrayList<>();
        List<Integer> oushu = new ArrayList<>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                oushu.add(nums[i]);
            } else {
                jishu.add(nums[i]);
            }
        }
        jishu.addAll(oushu);

        for (int j = 0; j < jishu.size(); j++) {
            result[j] = jishu.get(j);
        }
        return result;
    }


    //˫ָ�뷨
    public int[] exchange2(int[] nums) {
        int right = nums.length - 1;
        int left = 0;

        while (right > left) {
            while ((right > left) && nums[right] % 2 == 0) {
                right--;
            }

            while ((right > left) && nums[left] % 2 == 1) {
                left++;
            }
            int tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
        return nums;
    }
}
