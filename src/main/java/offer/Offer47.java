package offer;

/**
 * Created by wxg on 2020/12/22.
 */
public class Offer47 {
    public int maxValue(int[][] grid) {
        if (grid.length == 0) return 0;
        int[][] dp = new int[grid.length][grid[0].length];

        dp[0][0] = grid[0][0];

        for (int row = 1; row < grid.length; row++) {
            dp[row][0] = dp[row - 1][0] + grid[row][0];
        }

        for (int col = 1; col < grid[0].length; col++) {
            dp[0][col] = dp[0][col - 1] + grid[0][col];
        }

        for (int row = 1; row < grid.length; row++) {
            for (int col = 1; col < grid[0].length; col++) {
                dp[row][col] = Math.max(dp[row - 1][col], dp[row][col - 1]) + grid[row][col];
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }
}
