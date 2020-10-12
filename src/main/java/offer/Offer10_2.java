package offer;

/**
 * Created by wxg on 2020/10/12.
 */
public class Offer10_2 {

    public static void main(String[] args) {
        System.out.println(numWays(7));
    }

    public static int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
        }
        return dp[n];
    }
}
