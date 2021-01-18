package 剑指Offer;

/**
 * Created by wxg on 2020/10/12.
 */
public class Offer10_1 {
    public static void main(String[] args) {
        System.out.println(fib2(41));
    }

    //��̬�滮
    public static int fib1(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }

    //    �ݹ�
    public static int fib2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        int first = fib2(n - 1) % 1000000007;
        int second = fib2(n - 2) % 1000000007;
        return (first + second) % 1000000007;
    }
}
