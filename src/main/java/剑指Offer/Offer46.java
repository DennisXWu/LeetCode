package 剑指Offer;

/**
 * Created by wxg on 2021/1/5.
 */
public class Offer46 {

    public static void main(String[] args) {
        System.out.println(translateNum(1234));
    }

    public static int translateNum(int num) {
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;

        for (int i = 1; i < chars.length; i++) {
            int subInt = Integer.parseInt(s.substring(i - 1, i + 1));
            if (subInt >= 10 && subInt <= 25) {
                if (i >= 2) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                } else {
                    dp[i] = dp[i - 1] + 1;
                }
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[chars.length - 1];
    }
}
