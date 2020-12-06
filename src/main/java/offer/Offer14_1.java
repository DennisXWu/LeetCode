package offer;

/**
 * Created by wxg on 2020/12/6.
 */
public class Offer14_1 {

    public static void main(String[] args) {
        Offer14_1 offer14_1 = new Offer14_1();
        System.out.println(offer14_1.cuttingRope(10));
    }

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        if (n == 2) {
            return 1;
        }

        if (n == 3) {
            return 2;
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
            }
        }
        return dp[n];
    }
}
