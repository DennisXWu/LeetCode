package offer;

/**
 * Created by wxg on 2020/10/15.
 */

import java.util.Arrays;

/**
 * �������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��
 *
 * ʾ�� 1:
 *
 * ����: n = 1
 * ���: [1,2,3,4,5,6,7,8,9]
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
