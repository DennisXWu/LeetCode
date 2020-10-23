package offer;

/**
 * Created by wxg on 2020/10/23.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * 示例 2：
 *
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 */
public class Offer57_II {
    public static void main(String[] args) {
        int[][] result = findContinuousSequence2(9);
        System.out.println(Arrays.deepToString(result));
    }


    //暴力法
    public static int[][] findContinuousSequence(int target) {
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i <= (target - 1) / 2; i++) {
            for (int j = i; ; j++) {
                sum += j;
                if (sum > target) {
                    sum = 0;
                    break;
                } else if (sum == target) {
                    int[] array = new int[j - i + 1];
                    for (int k = i; k <= j; k++) {
                        array[k - i] = k;
                    }
                    list.add(array);
                    sum = 0;
                    break;
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }


    //双指针法
    public static int[][] findContinuousSequence2(int target) {
        int left = 1;
        int right = 1;
        int sum = 0;
        List<int[]> list = new ArrayList<>();
        while (left <= target / 2) {
            if (sum < target) {
                sum += right;
                right++;
            } else if (sum > target) {
                sum -= left;
                left++;
            } else if (sum == target) {
                int[] array = new int[right - left];
                for (int k = left; k < right; k++) {
                    array[k - left] = k;
                }
                list.add(array);
                sum -= left;
                left++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
