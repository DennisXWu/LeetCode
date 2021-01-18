package 剑指Offer;

/**
 * Created by wxg on 2020/10/15.
 */

import java.util.Arrays;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 */
public class Offer17 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(10)));
    }

    public static int[] printNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int v = (int) (9 * Math.pow(10, i - 1));
            sum += v;
        }
        int[] dp = new int[sum];
        for (int j = 0; j <= sum - 1; j++) {
            dp[j] = j + 1;
        }
        return dp;
    }
}
