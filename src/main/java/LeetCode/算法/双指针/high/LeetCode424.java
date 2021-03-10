package LeetCode.算法.双指针.high;

/**
 * Created by wxg on 2021/3/9.
 */
public class LeetCode424 {
    public static void main(String[] args) {
        new LeetCode424().characterReplacement("AABABBA", 2);
    }

    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int max = 0;
        char[] array = new char[26];

        while (right < s.length()) {
            array[s.charAt(right) - 'A']++;
            max = Math.max(array[s.charAt(right) - 'A'], max);

            if (right - left + 1 - max > k) {
                array[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }


}
