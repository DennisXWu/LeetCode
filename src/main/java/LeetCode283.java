import java.util.Arrays;

/**
 * Created by wxg on 2020/8/6.
 */
public class LeetCode283 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        for (int p = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p++] = temp;
                System.out.println("num[i]=" + nums[i] + " nums= " + Arrays.toString(nums));
            }
        }
    }

//    public static void moveZeroes(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                nums[count] = nums[i];
//                count++;
//            }
//        }
//
//        for (int j = count; j < nums.length; j++) {
//            nums[j] = 0;
//        }
//        System.out.println(Arrays.toString(nums));
//    }
}
