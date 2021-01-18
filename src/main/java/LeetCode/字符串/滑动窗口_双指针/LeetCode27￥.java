package LeetCode.字符串.滑动窗口_双指针;

/**
 * Created by wxg on 2021/1/17.
 */
public class LeetCode27￥ {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new LeetCode27￥().baoliRemoveElement(array, 2));
    }

    //暴力
    public int baoliRemoveElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                i--;
                length--;
            }
        }
        return length;
    }

    //交换移除
    public int exeRemoveElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

    //双指针
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[index++] = nums[i];
        }
        return index;
    }
}
