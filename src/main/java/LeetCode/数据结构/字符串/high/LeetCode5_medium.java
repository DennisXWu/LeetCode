package LeetCode.数据结构.字符串.high;

/**
 * Created by wxg on 2021/2/7.
 */
public class LeetCode5_medium {
    public static void main(String[] args) {
        LeetCode5_medium leetCode5 = new LeetCode5_medium();
        String s = leetCode5.longestPalindrome2("bb");
        System.out.println(s);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }
        String max = Character.toString(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    String subStr = s.substring(i, j + 1);
                    if (new StringBuilder(subStr).reverse().toString().equals(subStr)) {
                        if (max.length() < subStr.length()) {
                            max = subStr;
                        }
                    }
                }
            }
        }
        return max;
    }


    public String longestPalindrome2(String s) {
        String max = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            String result1 = solve(i - 1, i + 1, s);
            String result2 = solve(i, i + 1, s);
            if (result1.length() > max.length() && result1.length() > result2.length()) {
                max = result1;
            } else if (result2.length() > max.length() && result2.length() > result1.length()) {
                max = result2;
            }
        }
        return max;

    }

    private String solve(int l, int r, String s) {
        String result = "";
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            result = s.substring(l, r + 1);
            l--;
            r++;
        }
        return result;
    }
}
