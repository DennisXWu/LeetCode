package LeetCode.数据结构.字符串.high;

/**
 * Created by wxg on 2021/2/7.
 */
public class LeetCode5_medium_2 {
    public static void main(String[] args) {
        LeetCode5_medium_2 leetCode5 = new LeetCode5_medium_2();
        String s = leetCode5.longestPalindrome2("babad");
        System.out.println(s);
    }

    public String longestPalindrome(String s) {
        if (null == s || s.length() == 1) return s;
        String max = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (new StringBuilder(substring).reverse().toString().equals(substring) && max.length() < substring.length()) {
                    max = substring;
                }
            }
        }
        return max;
    }

    public String longestPalindrome2(String s) {
        if (null == s || s.length() == 1) return s;
        String max = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            String result1 = solve(i - 1, i + 1, s);
            String result2 = solve(i, i + 1, s);
            if (result1.length() > max.length() && result1.length() > result2.length()) {
                max = result1;
            }

            if (result2.length() > max.length() && result2.length() > result1.length()) {
                max = result2;
            }
        }
        return max;
    }

    public String solve(int l, int r, String s) {
        String result = "";
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            result = s.substring(l, r + 1);
            l--;
            r++;
        }
        return result;
    }
}
